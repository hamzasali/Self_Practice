package day06_ifStatements;

public class MonthName {
    public static void main(String[] args) {
        int number = 0;
        String result = "";

        if (number == 1) {
            result = "January";
        }
        if (number == 2) {
            result = "February";
        }
        if (number == 3) {
            result = "March";
        }
        if (number == 4) {
            result = "April";
        }
        if (number == 5) {
            result = "May";
        }
        if (number == 6) {
            result = "June";
        }
        if (number == 7) {
            result = "July";
        }
        if (number == 8) {
            result = "August";
        }
        if (number == 9) {
            result = "September";
        }
        if (number == 10) {
            result = "October";
        }
        if (number == 11) {
            result = "November";
        }
        if (number == 12) {
            result = "December";
        }
        if (number > 12 || number < 1) {
            System.err.println("ERROR!");
        }
        System.out.println(result);

    }
}
