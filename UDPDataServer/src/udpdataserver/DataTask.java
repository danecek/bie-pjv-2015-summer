/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpdataserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class DataTask implements Runnable {

    int port = 3333;

    @Override
    public void run() {
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        try (DatagramSocket socket = new DatagramSocket(port)) {
            for (;;) {
                System.out.println("server is waiting");
                socket.receive(packet);
                byte[] answer = (new Date().toString()).getBytes();
                packet.setData(answer);
                System.out.println("server answered");
                socket.send(packet);
                packet.setData(buf);
            }
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.toString());
        }
    }
}
