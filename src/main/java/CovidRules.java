public class CovidRules {
   public static String checkIfTooManyPersons(int numberPersons){
        if (numberPersons >30){
            return "Zu viele Personen";
        }else{
            return "Maximale Personenzahl nicht überschritten";
        }
   }

}
