import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CovidRulesTest {

    @Test
    @DisplayName("The \"personsInStore\" method should return \"Zu viele Personen\"")
    public void personsInStoreShouldReturnZuVieleTest(){
        //GIVEN
        int persons = 31;

        //WHEN
        String string = CovidRules.checkIfTooManyPersons(31);

        //THEN
        assertEquals("Zu viele Personen", string);
    }

    @Test
    @DisplayName("The \"personsInStore\" method should return \"Maximale Personenzahl nicht überschritten\"")
    public void personsInStoreShouldReturnOKTest(){
        //GIVEN
        int persons = 31;

        //WHEN
        String string = CovidRules.checkIfTooManyPersons(30);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten" , string);
    }
}
