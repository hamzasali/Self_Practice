package mentoringPractice;

public class TestCydeoDeveloper {
    public static void main(String[] args) {
        CydeoDeveloper developer1 = new CydeoDeveloper();

        developer1.setInfo("Hamza", "Ali", "NY", "Brooklyn", 6);

        System.out.println(developer1);

        developer1.recordFlipgrid();
        developer1.attendingLiveSession();
        developer1.takingQuiz();
        developer1.attendingMentorMeeting();
        developer1.doingGroupStudy();


    }
}
