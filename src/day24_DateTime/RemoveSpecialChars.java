package day24_DateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecialChars {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> !Character.isLetterOrDigit(p));
        System.out.println(list);
    }
}
