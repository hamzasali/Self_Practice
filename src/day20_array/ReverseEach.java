package day20_array;

import java.util.Arrays;

public class ReverseEach {
    public static void main(String[] args) {
        String str = "I Love Java";

        String[] words = str.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            char ch = words[2].charAt(3);
            System.out.println(ch);
        }

    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */