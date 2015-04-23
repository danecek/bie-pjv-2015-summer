/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import static javafxclient.JavaFXClient.serverPort;

/**
 *
 * @author danecek
 */
public class AskServerTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        InetAddress serverAddr = InetAddress.getLocalHost();
        try (DatagramSocket socket = new DatagramSocket()) {
            socket.setSoTimeout(2000);
            byte[] q = new byte[0];
            DatagramPacket packet
                    = new DatagramPacket(q, 0,
                            serverAddr, serverPort);
            socket.send(packet);
            packet.setData(new byte[256]);
            socket.receive(packet);
            return new String(packet.getData(), 0, packet.getLength());
        }
    }

}
