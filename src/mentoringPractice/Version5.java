package mentoringPractice;

public class Version5 {
    public static void main(String[] args) {

        FoxClass[] foxes = new FoxClass[4];


        FoxClass fox1 = new FoxClass();
        fox1.setInfo(true, true, "BLACK", 0);
        foxes[0] = fox1;

        FoxClass fox2 = new FoxClass();
        fox2.setInfo(true, true, "BLACK", 2);
        foxes[1] = fox2;

        FoxClass fox3 = new FoxClass();
        fox3.setInfo(true, true, "BLACK", 3);
        foxes[2] = fox3;

        FoxClass fox4 = new FoxClass();
        fox4.setInfo(false, true, "Gray", 3);
        foxes[3] = fox4;


        for (int i = 0; i < 4; i++) {

            isSuspect(foxes[i], i + 1);
        }
    }

    public static void isSuspect(FoxClass fox, int foxNumber) {
        if (fox.isWearingCoat && fox.coatColor.equalsIgnoreCase("black") && fox.hasATorch && fox.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox" + foxNumber + " is one of the suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox" + foxNumber + " is cleared of charges!");
        }

    }

    /*public static void printSuspectStatus(boolean isSuspect, int foxNumber) {
        if (isSuspect) {
            System.out.println("\uD83E\uDD8A Fox " + foxNumber + " is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox " + foxNumber + " cleared of charges!");
        }
    }

    public static boolean isSuspect(FoxClass fox) {
        return fox.isWearingCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;
    }*/
}
