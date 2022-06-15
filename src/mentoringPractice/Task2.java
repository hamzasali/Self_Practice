package mentoringPractice;

public class Task2 {
    public static void main(String[] args) {

        String str = "ABBA"; // 2

        String nonDup = ""; // to save the non duplicated

        int dupCount = 0;

        str = str.toLowerCase(); // for case sensitivity

        for (int j = 0; j < str.length(); j++) { // to get all single characters separately

            char ch = str.charAt(j);
            int count = 0; // count the frequency of chars

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (nonDup.contains("" + ch)) {//if the character is already added into result
                continue;//skip that character
            }
            nonDup += "" + ch; // add all the non-duplicate characters
            if (count != 1) {
                dupCount++;
            }
        }
        System.out.println(dupCount);

    }

}

/*Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
digits that occur more than once in the input string. The input string can be assumed to contain only
alphabets both uppercase and lowercase and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice ('b' and 'B")
"indivisibility" -> 1 # 'l' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" ->2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */