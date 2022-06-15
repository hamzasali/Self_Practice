package day21_multiDimensionalArray;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] eachArr : items) {
            System.out.println();
            for (String each : eachArr) {
                System.out.print(each + "\t");
            }
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (String[] eachArr : items) {
            System.out.println();
            for (int i = eachArr.length - 1; i >= 0; i--) {
                String each = eachArr[i];
                System.out.print(each + "\t");
            }
        }
        System.out.println();
        System.out.println("---------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            String[] eachArr = items[i];
            System.out.println();
            for (String each : eachArr) {
                System.out.print(each + "\t");
            }
        }
    }
}

/*
Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */