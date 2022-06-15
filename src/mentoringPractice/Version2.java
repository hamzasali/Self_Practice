package mentoringPractice;

public class Version2 {
    public static void main(String[] args) {


        FoxClass fox1 = new FoxClass();
        fox1.setInfo(true, true, "BLACK", 0);

        FoxClass fox2 = new FoxClass();
        fox2.setInfo(true, true, "BLACK", 2);

        FoxClass fox3 = new FoxClass();
        fox3.setInfo(true, true, "BLACK", 3);

        FoxClass fox4 = new FoxClass();
        fox4.setInfo(false, true, "Gray", 3);

        if (isSuspect(fox1)) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }
        if (isSuspect(fox2)) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }
        if (isSuspect(fox3)) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }
        if (isSuspect(fox4)) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }
    }

    public static boolean isSuspect(FoxClass fox) {
        return fox.isWearingCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;
    }
}