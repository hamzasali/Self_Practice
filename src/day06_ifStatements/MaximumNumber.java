package day06_ifStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int num1 = 210, num2 = 211;
        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        }
        if (num1 < num2) {
            System.out.println(num2 + " is the maximum number");
        }
        if(num1==num2){
            System.out.println("Both are equal");
        }

    }
}
