package mentoringPractice;

public class ThiefFoxTest {
    public static void main(String[] args) {

        Fox fox1 = new Fox();
        fox1.setInfo(true, true, "Black", 0);

        Fox fox2 = new Fox();
        fox2.setInfo(true, true, "Black", 2);

        Fox fox3 = new Fox();
        fox3.setInfo(true, true, "Black", 3);

        Fox fox4 = new Fox();
        fox4.setInfo(false, true, "Gray", 3);

        fox1.isThief(1);
        fox2.isThief(2);
        fox3.isThief(3);
        fox4.isThief(4);

        System.out.println("---------------------------------------------------");

        /*ThiefFoxTest.isThief(1, true, true, "Black", 0);

        ThiefFoxTest.isThief(1, true, true, "Black", 2);

        ThiefFoxTest.isThief(1, true, true, "Black", 3);

        ThiefFoxTest.isThief(1, false, true, "Gray", 3);
*/

    }
/*
    public static void isThief(int foxNumber, boolean isWearingCoat, boolean hasATorch, String coatColor, int bagCount) {
        if (isWearingCoat && coatColor.equalsIgnoreCase("black") && hasATorch && bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox" + foxNumber + " is one of the suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox" + foxNumber + " is cleared of charges!");
        }
    }
*/
}
/*
  We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
  Luckily guard rooster have some info to identify the guilty fox.
  Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
  thief fox had a black coat, a torch and 3 bags.
  Find the suspect foxes, if a fox is cleared of charges write that also
 */