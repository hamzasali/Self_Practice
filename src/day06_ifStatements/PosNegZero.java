package day06_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = -20;
        String result = "";

        if (number > 0){
            result = "Positive";
        }
        if (number < 0){
            result = "Negative";
        }
        if (number == 0){
            result = "Zero";
        }
        System.out.println("result = " + result);
    }
}
