package day14_forLoop;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "A1B2C34";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '0' && str.charAt(i) <= '9') {
                sum += str.charAt(i)-48;
            }
        }
        System.out.println(sum);

    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */