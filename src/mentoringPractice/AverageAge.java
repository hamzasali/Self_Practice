package mentoringPractice;

public class AverageAge {
    public static void main(String[] args) {
        int boysInGroup = 30;
        int aveAge = 16;
        int boyLeftAge = 19;
        int totalGroupAge = boysInGroup * aveAge - boyLeftAge;
        double newAverage = 15.8;
        double newAge = newAverage * boysInGroup;

        int newBoyAge = (int) newAge - totalGroupAge;


        System.out.println(newBoyAge);
    }
}
