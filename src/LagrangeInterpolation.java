public class LagrangeInterpolation {
    public static double lagrangeInterpolation(double[] x, double[] y, double value) {
        int n = x.length;
        double result = 0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    term *= (value - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }


}
