package mentoringPractice;

public class AnimalFeast {
    public static void main(String[] args) {

        System.out.println(feast("great blue heron","garlic naan" ));
    }

    public static boolean feast(String animalName, String dish) {
        if (animalName.charAt(0) == dish.charAt(0) &&
                animalName.charAt(animalName.length() - 1) == dish.charAt(dish.length() - 1)) {
            return true;
        }
        return false;
    }
}
/*
All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start
and end with the same letters as the animal's name.
For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
Write a method feast that takes the animal's name and dish as arguments and returns true or false to indicate whether
the beast is allowed to bring the dish to the feast.
Assume that animal and dish are always lowercase strings, and that each has at least two letters. Animal and dish may
contain hyphens and spaces, but these will not appear
at the beginning or end of the string. They will not contain numerals.
 */