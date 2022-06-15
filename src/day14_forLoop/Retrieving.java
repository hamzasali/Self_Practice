package day14_forLoop;

public class Retrieving {
    public static void main(String[] args) {

        String word = "mn@#123Ab!";
        String letters = "";
        String digits = "";
        String specialChar = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z' || word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                letters += word.charAt(i);
            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                digits += word.charAt(i);
            } else {
                specialChar += word.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);
    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */