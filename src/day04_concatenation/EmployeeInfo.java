package day04_concatenation;

public class EmployeeInfo {
    public static void main(String[] args){

        int age = 23, salary = 125000;
        String name = "Ali", gender = "Male", company_name = "Apple Inc", jobTitle = "Developer";

        System.out.println("Given Data:");
        System.out.println("\tname = " + name);
        System.out.println("\tage = " + age);
        System.out.println("\tgender = " + gender);
        System.out.println("\tcompany_name = " + company_name);
        System.out.println("\tjobTitle = " + jobTitle);
        System.out.println("\tsalary = " + salary);
        System.out.println();

        System.out.println("Output:");
        System.out.println("\t"+name + " is " + age + " years old, gender is "+ gender+".");
        System.out.println("\t"+name +" works at " + company_name + " as a " + jobTitle +".");
        System.out.println("\t"+name + " makes $" + salary + " per year.");

    }
}
/*
Declare the following Variables:
1. name
2. age
3. gender
4. company_name 5. jobTitle
6. salary
3. Use concatenation to display the full info of the employee:
Ex:
given data:
name = “Daniel”
age = 28
gender = “Male” company_name = “Google Inc” job_title = ”Software Developer" salary = 90000
output:
Daniel is 28 years old, gender is Male.
Daniel works at Google Inc as a Software Developer. Daniel makes $ 90000 per year.
 */