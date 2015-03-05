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
public class PINumber {

    /**
     * @param args the command line arguments
     */
      static void main(String[] args) {
        int n = 1000000;
//        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
//        n *=10;
//        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
//        n *=10;
//        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
//        n *=10;
//        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
//        n *=10;
//        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
//        n *=10;
//        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
//        n *=10;
        evalPI(n);
        evalPIOPP(n);
        long time = System.currentTimeMillis();
        System.out.printf("PI number for %d experiments is %f\n", n, evalPI(n));
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        System.out.printf("PI number for %d experiments is %f\n", n, evalPIOPP(n));
        System.out.println(System.currentTimeMillis() - time);
    }

    static double evalPI(int n) {
        int circlePointsCounter = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distSqr = x * x + y * y;
            if (distSqr < 1)
               circlePointsCounter++;
        }
        return 4.0 * circlePointsCounter / n;
    }

    static double evalPIOPP(int n) {
        int circlePointsCounter = 0;
        for (int i = 0; i < n; i++) {
                        double x = Math.random();
            double y = Math.random();
            Point p = new Point(x ,y );
            if (p.distanceFromOrigin() < 1)
               circlePointsCounter++;
        }
        return 4.0 * circlePointsCounter / n;
    }
}
