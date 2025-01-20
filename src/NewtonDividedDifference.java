public class NewtonDividedDifference {
    public static double dividedDifference(double[] x, double[] y, double value) {
        int n = x.length;
        double[][] diffTable = new double[n][n];

        for (int i = 0; i < n; i++) {
            diffTable[i][0] = y[i];
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                diffTable[i][j] = (diffTable[i + 1][j - 1] - diffTable[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        double result = diffTable[0][0];
        double term = 1;
        for (int i = 1; i < n; i++) {
            term *= (value - x[i - 1]);
            result += term * diffTable[0][i];
        }

        return result;
    }

}
