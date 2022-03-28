package Day6;

public class WeekRunner {

    public static void main(String[] args) {
        String[] allDaysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String dayWithMaxLetters = "";
        for (String eachDay : allDaysOfWeek){
            if (eachDay.length() > dayWithMaxLetters.length()) {
                dayWithMaxLetters = eachDay;
            }
        }
        System.out.println("Day with most number of letters --> " + dayWithMaxLetters);


        System.out.println("Days in reverse order -->");
        for (int ind = allDaysOfWeek.length-1; ind >= 0; ind--){
            System.out.print("  " + allDaysOfWeek[ind]);
        }
    }


}
