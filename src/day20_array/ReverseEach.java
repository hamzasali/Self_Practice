package day20_array;

import java.util.Arrays;

public class ReverseEach {
    public static void main(String[] args) {
        String str = "I Love Java";

        String[] words = str.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i == 2) {
                String word = words[i];
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";
            } else {
                result += words[i] + " ";
            }
        }
        System.out.println(result);
    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */