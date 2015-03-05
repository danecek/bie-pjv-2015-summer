/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinumber;

/**
 *
 * @author danecek
 */
public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + getX() + "," + getY() + ']';
    }

    double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

}
