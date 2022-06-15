package day06_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 1, b =2, c = 3;
        String result = "";

        if(a>b && a<c || a<b && a>c){
            result = "A";

        }
        if(b>a && b<c || b<a && b>c){
            result = "B";
        }
        if(c>a && c<b || c<a && c>b){
            result = "C";
        }
        System.out.println(result);
    }
}
