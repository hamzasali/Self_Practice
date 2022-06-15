package day10_string;

import java.util.Scanner;

public class PrintWithoutFirstChar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter First word:");
        String w1 = keyboard.next();
        System.out.println("Enter second word:");
        String w2 = keyboard.next();

        System.out.println(w1.substring(1)+w2.substring(1));

        keyboard.close();
    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */