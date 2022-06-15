package mentoringPractice;

public class Version3 {
    public static void main(String[] args) {


        FoxClass fox1 = new FoxClass();
        fox1.setInfo(true, true, "BLACK", 0);

        FoxClass fox2 = new FoxClass();
        fox2.setInfo(true, true, "BLACK", 2);

        FoxClass fox3 = new FoxClass();
        fox3.setInfo(true, true, "BLACK", 3);

        FoxClass fox4 = new FoxClass();
        fox4.setInfo(false, true, "Gray", 3);


        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1:
                    printSuspectStatus(isSuspect(fox1), i);
                    break;
                case 2:
                    printSuspectStatus(isSuspect(fox2), i);
                    break;
                case 3:
                    printSuspectStatus(isSuspect(fox3), i);
                    break;
                case 4:
                    printSuspectStatus(isSuspect(fox4), i);
                    break;
            }
        }
    }

    public static void printSuspectStatus(boolean isSuspect, int foxNumber) {
        if (isSuspect) {
            System.out.println("\uD83E\uDD8A Fox " + foxNumber + " is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox " + foxNumber + " cleared of charges!");
        }
    }

    public static boolean isSuspect(FoxClass fox) {
        return fox.isWearingCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;
    }
}
