public class SecondDegreeEquation {

    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    public SecondDegreeEquation(double coefficientA, double coefficientB, double coefficientC) throws InvalidCoefficientException {
        if (coefficientA == 0)
            throw new InvalidCoefficientException("Invalid Coefficient.");

        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
    }

    public double getCoefficientA() {
        return coefficientA;
    }

    public double getCoefficientB() {
        return coefficientB;
    }

    public double getCoefficientC() {
        return coefficientC;
    }
}
