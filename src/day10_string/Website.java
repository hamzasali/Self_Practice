package day10_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Website:");
        String website = input.next();
        String validity = "(" + website + ") is Valid Website";
        if(website.startsWith("www.")&&
                website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov")){
            System.out.println(validity);
        }else{
            System.out.println("("+ website +") is not valid");
        }
        input.close();
    }
}
/*
1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov
 */