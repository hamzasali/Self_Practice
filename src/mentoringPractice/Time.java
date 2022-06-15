package mentoringPractice;

public class Time {
    public static void main(String[] args) {
        long milliSeconds = 366000;

        /*double seconds =(double) milliSeconds/1000;
        double minutes = seconds/60;
        double hours = minutes/60;

        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);*/

        int remainMilliSeconds =(int) milliSeconds % 1000;

        int seconds = (int) (milliSeconds / 1000) % 60;

        int minutes = (int) (milliSeconds / (1000 * 60)) % 60;

        int hours = (int) (milliSeconds / (1000 * 60 * 60));

        System.out.println("seconds = " + seconds);
        System.out.println("minutes = " + minutes);
        System.out.println("hours = " + hours);
        System.out.println("remainMilliSeconds = " + remainMilliSeconds);
    }
}
