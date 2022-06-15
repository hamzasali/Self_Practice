package mentoringPractice;

public class AllLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Be yourself, everyone else is taken");
        }
        System.out.println("-----------------------------------------");

        int i = 0;
        while (i < 5) {
            System.out.println("Be yourself, everyone else is taken");
            i++;
        }
        System.out.println("-----------------------------------------");

        i = 0;
        do {
            System.out.println("Be yourself, everyone else is taken");
            i++;
        } while (i != 5);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");


        i = 1;
        while (i < 10) {
            if ((i++) % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------------");
        String str = "guess me";
        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j));
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        String str1 = "guess me";
        for (int j = 0; j < str1.length(); j++) {
            System.out.print(str1.substring(j, j + 1));
        }
        System.out.println();
        System.out.println("-----------------------------------------");


        String str2 = "Cydeo";
          for (int j = 0; j < str2.length(); j++) {
            str2 += str2.substring(j, j + 1);
            System.out.println(str2);
        }


    }
}
