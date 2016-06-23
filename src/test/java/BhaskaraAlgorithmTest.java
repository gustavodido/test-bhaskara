import exception.InvalidDeltaException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BhaskaraAlgorithmTest {

    private BhaskaraAlgorithm bhaskaraAlgorithm;

    @Before
    public void setUp() {
        bhaskaraAlgorithm = new BhaskaraAlgorithm();
    }

    @Test
    public void shouldCorrectlyResolveEquation()  {
        SecondDegreeEquation equation = new SecondDegreeEquation(1, -5, 6);
        SecondDegreeEquationResult result = bhaskaraAlgorithm.resolve(equation);

        assertThat(result.getFirstRoot(), is(3.0));
        assertThat(result.getSecondRoot(), is(2.0));
    }

    @Test(expected = InvalidDeltaException.class)
    public void shouldTestIfDeltaIsPositive()  {
        SecondDegreeEquation equation = new SecondDegreeEquation(2, 1, 2);
        bhaskaraAlgorithm.resolve(equation);
    }

}
