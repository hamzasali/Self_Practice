package day24_DateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {
    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(LocalDate.of(2016, 8, 8),
                LocalDate.of(2016, 8, 20), LocalDate.of(2019, 2, 19)));

        dates.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(dates);

    }
}
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */