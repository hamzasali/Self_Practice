package mentoringPractice;

public class Version1 {
    public static void main(String[] args) {

        FoxClass fox1 = new FoxClass();
        fox1.setInfo(true, true, "BLACK", 0);

        FoxClass fox2 = new FoxClass();
        fox2.setInfo(true, true, "BLACK", 2);

        FoxClass fox3 = new FoxClass();
        fox3.setInfo(true, true, "BLACK", 3);

        FoxClass fox4 = new FoxClass();
        fox4.setInfo(false, true, "Gray", 3);

        if (fox1.isWearingCoat && fox1.coatColor.equals("BLACK") && fox1.hasATorch && fox1.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }
        if (fox2.isWearingCoat && fox2.coatColor.equals("BLACK") && fox2.hasATorch && fox2.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }
        if (fox3.isWearingCoat && fox3.coatColor.equals("BLACK") && fox3.hasATorch && fox3.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }
        if (fox4.isWearingCoat && fox4.coatColor.equals("BLACK") && fox4.hasATorch && fox4.bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }

    }
}