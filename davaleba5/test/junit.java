import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class junit {
    @Test
    public void calculatorTest() {
        CalculatorService calculatorService = new CalculatorServiceImpl();

        assertEquals(10., calculatorService.sum(7., 3));
        assertEquals(20., calculatorService.prod(4, 5));

    }
}
