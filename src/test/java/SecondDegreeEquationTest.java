import exception.InvalidCoefficientException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SecondDegreeEquationTest {
    @Test(expected = InvalidCoefficientException.class)
    public void shouldNotAcceptZeroAsTheCoefficentA() throws InvalidCoefficientException {
        new SecondDegreeEquation(0.0, 1.0, 2.0);
    }

    @Test
    public void shouldAcceptValidCoefficents() throws InvalidCoefficientException {
        SecondDegreeEquation equation = new SecondDegreeEquation(1.0, 2.0, 3.0);

        assertThat(equation.getCoefficientA(), is(1.0));
        assertThat(equation.getCoefficientB(), is(2.0));
        assertThat(equation.getCoefficientC(), is(3.0));
    }

}
