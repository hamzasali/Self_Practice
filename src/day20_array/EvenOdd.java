package day20_array;

public class EvenOdd {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,};
        int even = 0;
        int odd = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
                even++;

            } else {
                System.out.print("'" + each + "' ");
                odd++;
            }
        }
        System.out.println();
        System.out.println("Total even: " + even);
        System.out.println("Total odd: " + odd);
    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */