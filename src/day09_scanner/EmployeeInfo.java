package day09_scanner;
import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Enter your full name");
        String name = input.nextLine();
        System.out.println("2. Enter your age");
        int age = input.nextInt();
        System.out.println("3. Enter your gender: (M or F)");
        char gender = input.next().charAt(0);
        input.nextLine();
        System.out.println("4. Enter your company name");
        String compName = input.nextLine();
        System.out.println("5. Enter your job title");
        String jobTitle = input.nextLine();
        System.out.println("6. Enter your salary");
        double salary = input.nextDouble();

        System.out.println("Employee's name: "+name);
        System.out.println("Employee's age = " + age);
        System.out.println("Employee's gender = " + gender);
        System.out.println("Company Name = " + compName);
        System.out.println("Job Title = " + jobTitle);
        System.out.println("Salary = " + salary);


        input.close();
    }
}
/*
Create a class named EmployeeInfo and Ask the user to:
        2.1 Enter your full name
        2.2 Enter your age
        2.3 Enter your gender
        2.4 Enter your company name
        2.5 Enter your job title
        2.6 Enter your salary

        Display:
            Employee's name
            Employee's age
            Employee's gender
            Company name
            Employee's job title
            Employee's salary
 */