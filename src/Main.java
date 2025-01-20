public class Main {
    public static void main(String[] args) {
        double[] x1 = {1, 1.4, 1.8, 2.2};
        double[] y1 = {3.49, 4.82, 5.96, 6.5};
        double value1 = 1.6;

        System.out.println("Newton's Forward Interpolation result: " + NewtonForwardInterpolation.forwardInterpolation(x1, y1, value1));

        double[] x2 = {5, 6, 9, 11};
        double[] y2 = {12, 13, 14, 16};
        double value2 = 10;

        System.out.println("Lagrange's Interpolation result: " + LagrangeInterpolation.lagrangeInterpolation(x2, y2, value2));

        double[] x3 = {3, 7, 9, 10};
        double[] y3 = {160, 120, 72, 63};
        double value3 = 6;

        System.out.println("Newton's Divided Difference result: " + NewtonDividedDifference.dividedDifference(x3, y3, value3));
    }
}