package mentoringPractice;


public class Grade {

    public static void main(String[] args) {
        int grade = 100;

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("excellent");
            } else if (grade >= 70) {
                System.out.println("good");
            } else if (grade >= 60) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        } else {
            System.out.println("Invalid score");
        }
    }
}

