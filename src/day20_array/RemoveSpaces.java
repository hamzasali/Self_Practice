package day20_array;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String str1 = str.trim();

        String[] split = str1.split(" ");

        String result = "";

        for (int i = 0; i < split.length; i++) {
            if(!split[i].equals("")){
                result += split[i];
                result += " ";
            }

        }

        System.out.println(result);
    }
}
