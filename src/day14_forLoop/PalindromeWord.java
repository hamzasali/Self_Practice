package day14_forLoop;

public class PalindromeWord {
    public static void main(String[] args) {
        String word = "Anna";

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        boolean palindrome = reverse.equalsIgnoreCase(word);
        System.out.println("Palindrome = " + palindrome);
    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */