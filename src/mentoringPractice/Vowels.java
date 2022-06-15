package mentoringPractice;

public class Vowels {

    public static void main(String[] args) {

        String str = "bbddffg";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                result += i;
            }else {
                System.out.println("-1");
            }


        }
        System.out.println(result);

    }

}
/*
Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index.
 If it doesn't exist, return -1. Assume that all the characters of the String are lowercase.
(Do not use String class functions other than charAt())

Ex1: bbddeeaffgi
output: 6

Ex2: aaabbbeeeoouu
output: -1
 */