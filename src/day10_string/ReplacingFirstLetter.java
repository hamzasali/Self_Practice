package day10_string;

import java.util.Scanner;

public class ReplacingFirstLetter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Word:");
        String word = keyboard.next();

        if(word.startsWith("x")){
            System.out.println(word.replaceFirst("x", "a"));
        }else{
            System.out.println(word);
        }
        keyboard.close();
    }
}
/*
 Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex
 */