import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialTest {

    @ParameterizedTest(name ="{0} should return {1}")
    @CsvSource({"0,1","1,1","2,2","3,6" })
    void testFactorial(int given, int expected) {
        //WHEN
        int actual = Factorial.factorial(given);
        //THEN
        assertEquals(expected,actual);
    }



}
