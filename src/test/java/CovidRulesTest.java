import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CovidRulesTest {

    @Test
    @DisplayName("The method \" giveAlertMaxPersons\" should return \"Zu viele Personen\"")
    public void giveAlertMaxPersonsShouldReturnZuVieleTest(){
        //GIVEN
        int persons1 = 1;
        String alarmLevel1 = "rot";
        int persons2 = 31;
        String alarmLevel2 = "gelb";
        int persons3 = 61;
        String alarmLevel3 = "grün";

        //WHEN
        String string1 = CovidRules.giveAlertMaxPersons(persons1, alarmLevel1);
        String string2 = CovidRules.giveAlertMaxPersons(persons2, alarmLevel2);
        String string3 = CovidRules.giveAlertMaxPersons(persons3, alarmLevel3);

        //THEN
        assertEquals("Zu viele Personen", string1);
        assertEquals("Zu viele Personen", string2);
        assertEquals("Zu viele Personen", string3);
    }

    @Test
    @DisplayName("The method \" giveAlertMaxPersons\" should return \"Maximale Personenzahl nicht überschritten\"")
    public void giveAlertMaxPersonsShouldReturnOK(){
        //GIVEN
        int persons1 = 0;
        String alarmLevel1 = "rot";
        int persons2 = 30;
        String alarmLevel2 = "gelb";
        int persons3 = 60;
        String alarmLevel3 = "grün";

        //WHEN
        String string1 = CovidRules.giveAlertMaxPersons(persons1, alarmLevel1);
        String string2 = CovidRules.giveAlertMaxPersons(persons2, alarmLevel2);
        String string3 = CovidRules.giveAlertMaxPersons(persons3, alarmLevel3);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten" , string1);
        assertEquals("Maximale Personenzahl nicht überschritten" , string2);
        assertEquals("Maximale Personenzahl nicht überschritten" , string3);
    }


}
