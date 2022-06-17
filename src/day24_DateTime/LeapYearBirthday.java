package day24_DateTime;

import java.time.LocalDate;

public class LeapYearBirthday {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(2000, 12, 25);

        System.out.println(birthday.isLeapYear());

        System.out.println(isLeapYear(2000, 10, 23));


    }

    public static boolean isLeapYear(int year, int month, int date) {
        return LocalDate.of(year, month, date).isLeapYear();
    }

}
/*
Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false

 */