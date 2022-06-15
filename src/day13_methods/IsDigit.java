package day13_methods;

public class IsDigit {
    public static void main(String[] args) {

        String input = "A1B2C359";

        int sum = 0;

        for(int i = 0; i < input.length(); i++){
            char chars = input.charAt(i);
            if(isDigit(chars)){
                sum += chars - 48;
            }
        }
        System.out.println(sum);
    }


    public static boolean isDigit(char ch) {
        boolean result = ch >= '0' && ch <= '9';
        return result;
    }
}