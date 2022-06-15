package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 12;

        boolean has28Days = number == 2;// if the month is 2(feb). then it has 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;
        String month = "";
        if (has28Days) {
            month = "28 Days";
        }
        if (has30Days) {
            month = "30 Days";
        }
        if (has31Days) {
            month = "31 Days";
        }
        System.out.println(month);
    }
}
