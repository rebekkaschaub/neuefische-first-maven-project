import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    @DisplayName("The \"add\" method should return sum of values")
    public void addTest(){
        //GIVEN
        int value1 = 3;
        int value2 = 7;

        //WHEN
        int sum = Calculator.add(value1, value2);

        //THEN
        assertEquals(10, sum);
    }

    @Test
    @DisplayName("The \"greaterThan100\" method should return true")
    public void greaterThan100Test(){
        //GIVEN
        int value = 101;

        //WHEN
        boolean res = Calculator.greaterThan100(value);

        //THEN
        assertTrue(res);
    }

}
