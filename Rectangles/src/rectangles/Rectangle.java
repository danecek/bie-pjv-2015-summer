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
public class Rectangle {

    private final Point refPoint;
    private final int width;
    private final int height;

    @Override
    public String toString() {
        return "[" + refPoint + width + ", " + height + ']';
    }

    public Rectangle(int x, int y, int edge) {
        this(x, y, edge, edge);
    }

    public Rectangle(int x, int y, int width, int height) {
        this(new Point(x, y), width, height);
    }

    public Rectangle(Point refPoint, int width, int height) {
        this.refPoint = refPoint;
        if (width < 0) {
            throw new IllegalArgumentException("negative!");
        }
        if (height < 0) {
            throw new IllegalArgumentException("negative!");
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point refPoint, Point lowRightConer) {
        this(refPoint,
                lowRightConer.getX() - refPoint.getX(),
                lowRightConer.getY() - refPoint.getY());
    }

    Point lowRightCorner() {
        return refPoint.move(width, height);
    }

    Rectangle union(Rectangle that) {
        int minx = Math.min(refPoint.getX(), that.getRefPoint().getX());
        int miny = Math.min(refPoint.getY(), that.getRefPoint().getY());
        int maxx = Math.max(lowRightCorner().getX(), that.lowRightCorner().getX());
        int maxy = Math.max(lowRightCorner().getY(), that.lowRightCorner().getY());
        return new Rectangle(new Point(minx, miny), new Point(maxx, maxy));
    }

    /**
     * @return the refPoint
     */
    public Point getRefPoint() {
        return refPoint;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

}
