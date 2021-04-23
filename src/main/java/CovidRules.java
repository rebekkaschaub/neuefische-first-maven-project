public class CovidRules {
   public static String giveAlertMaxPersons(int numberPersons , String alarmLevel){

       if(numberPersons<0){
           return "Fehler: Keine gültige Personenzahl";
       }

       int maxPersons = determineMaxPersonsForAlarmLevel(alarmLevel);

       if (numberPersons > maxPersons){
            return "Zu viele Personen";
        }

       return "Maximale Personenzahl nicht überschritten";
   }

    private static int determineMaxPersonsForAlarmLevel(String alarmLevel) {

        return switch (alarmLevel) {
            case "rot" -> 0;
            case "gelb" -> 30;
            case "grün" -> 60;
            default -> 0;
        };

    }


}
