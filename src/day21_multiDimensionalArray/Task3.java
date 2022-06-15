package day21_multiDimensionalArray;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String[][][][][][][][][][] array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};


        for (String[][][][][][][][][] m9 : array) {
            for (String[][][][][][][][] m8 : m9) {
                for (String[][][][][][][] m7 : m8) {
                    for (String[][][][][][] m6 : m7) {
                        for (String[][][][][] m5 : m6) {
                            for (String[][][][] m4 : m5) {
                                for (String[][][] m3 : m4) {
                                    for (String[][] m2 : m3) {
                                        for (String[] m1 : m2) {
                                            for (String each : m1) {
                                                System.out.println(each);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }



    }
}
/*
Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can dispay each elements of the given array


 */