package mentoringPractice;

import java.util.Scanner;

public class FastCar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the speed of car: ");
        int maxSpeed = scanner.nextInt();
        scanner.close();

        if (maxSpeed >= 200) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String result = (maxSpeed >= 200) ? "true" : "false";
        System.out.println("result = " + result);

        // this can be used for boolean
        System.out.println(maxSpeed >= 200);
    }
}
