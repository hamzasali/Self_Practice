package mentoringPractice;

import java.util.Random;
import java.util.Scanner;

public class RandomPractice {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 ~ 100");
        System.out.println("Enter your guess:");
        int givenNumber = input.nextInt();


        while ((givenNumber != number)) {


            if (givenNumber == number) {
                System.out.println("Yes, the number is " + number);
            } else if (givenNumber < number) {
                System.out.println("Your guess is too low");
                givenNumber = input.nextInt();
            } else {
                System.out.println("Your guess is too high");
                givenNumber = input.nextInt();
            }

        }


    }
}
