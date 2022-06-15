package day06_ifStatements;

public class WeekDays {
    public static void main(String[] args) {
        int number = 5;
        String dayOfWeek = "";
        if (number == 1) {
            dayOfWeek = "Sunday";
        }
        if (number == 2) {
            dayOfWeek = "Monday";
        }
        if (number == 3) {
            dayOfWeek = "Tuesday";
        }
        if (number == 4) {
            dayOfWeek = "Wednesday";
        }
        if (number == 5) {
            dayOfWeek = "Thursday";
        }
        if (number == 6) {
            dayOfWeek = "Friday";
        }
        if (number == 7) {
            dayOfWeek = "Saturday";
        }
        System.out.println("dayOfWeek = " + dayOfWeek);

    }
}
