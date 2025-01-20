public class NewtonForwardInterpolation {
    public static double forwardInterpolation(double[] x, double[] y, double value) {
        int n = x.length;
        double[][] diffTable = new double[n][n];

        for (int i = 0; i < n; i++) {
            diffTable[i][0] = y[i];
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                diffTable[i][j] = diffTable[i + 1][j - 1] - diffTable[i][j - 1];
            }
        }

        double result = y[0];
        double u = (value - x[0]) / (x[1] - x[0]);
        double uTerm = 1;

        for (int i = 1; i < n; i++) {
            uTerm *= (u - (i - 1));
            result += (uTerm * diffTable[0][i]) / factorial(i);
        }

        return result;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

}
