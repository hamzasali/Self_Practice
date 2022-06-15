package mentoringPractice;

public class CydeoDeveloper {
    public String firstName, lastname, state, city;
    public int group;


    public void recordFlipgrid(){
        System.out.println(firstName+" "+lastname+" from group "+group
        +" is recording his/her flipgrid answer");
    }

    public void attendingLiveSession(){
        System.out.println(firstName+" "+lastname+" from group "+group
                +" is attending the live session");
    }

    public void takingQuiz(){
        System.out.println(firstName+" "+lastname+" from group "+group
                +" is taking the quiz");
    }

    public void attendingMentorMeeting(){
        System.out.println(firstName+" "+lastname+" from group "+group
                +" is attending his/her weekly mentoring meeting");
    }

    public void doingGroupStudy(){
        System.out.println(firstName+" "+lastname+" from group "+group
                +" is doing his/her group studying");
    }

    public void setInfo(String firstName, String lastname, String state, String city, int group) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.state = state;
        this.city = city;
        this.group = group;
    }

    public String toString() {
        return "CydeoDeveloper{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
