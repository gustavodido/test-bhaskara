import exception.InvalidDeltaException;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class BhaskaraAlgorithm {
    public SecondDegreeEquationResult resolve(SecondDegreeEquation equation) {
        double delta = computeDelta(equation);
        if (delta <= 0) {
            throw new InvalidDeltaException("Delta must be a positive number.");
        }

        double denominator = 2 * equation.getCoefficientA();

        double firstRoot = (-equation.getCoefficientB() + sqrt(delta)) / denominator;
        double secondRoot = (-equation.getCoefficientB() - sqrt(delta)) / denominator;

        return new SecondDegreeEquationResult(firstRoot, secondRoot);
    }

    private double computeDelta(SecondDegreeEquation equation) {
        return pow(equation.getCoefficientB(), 2) - 4 * equation.getCoefficientA() * equation.getCoefficientC();
    }
}
