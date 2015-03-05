/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

/**
 *
 * @author danecek
 */
public class Point {

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    private final int x;
    private final int y;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "[" +  x + "," + y + ']';
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    Point move(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
    
    
}
