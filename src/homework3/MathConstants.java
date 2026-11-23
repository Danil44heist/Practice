package homework3;

public class MathConstants {

    private static final double PI = 3.14159;
    private static final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return PI * Math.pow(r,2);
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

    static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        return initialValue * Math.pow(E, rate * time);
    }

}
