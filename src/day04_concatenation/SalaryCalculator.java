package day04_concatenation;

public class SalaryCalculator {
    public static void main(String[] args) {
        String name = "Ali";
        int hourlyRate = 44, weeklyHours = 48;

        int salary = hourlyRate * weeklyHours * 52;

        System.out.println("Given Data:");
        System.out.println("\tname = " + name);
        System.out.println("\thourlyRate = " + hourlyRate);
        System.out.println("\tweeklyHours = " + weeklyHours);
        System.out.println("Output:");
        System.out.println("\t Hello " + name + ", your salary is $" + salary + ".");

    }
}
/*

2. Declare the following Variables: 1. name
2. hourlyRate 3. weeklyHours
3. Write a program that can calculate the salary,and display the following info:
Hint: there are 52 weeks in a year
salary = hourlyRate * weeklyHours * 52
Ex:
given data:
name = “Joshua” hourlyRate = 40 weeklyHours = 45
output:
Hello Joshua, your salary is $ 93600
 */