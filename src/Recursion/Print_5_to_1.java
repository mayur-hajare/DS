package Recursion;

public class Print_5_to_1 {
    public static void main(String[] args) {
        int n=5;
        PrintNumbers(n);
    }
    public static void PrintNumbers(int n){
        if(n==0)
            return;

        System.out.println(n+" ");
        PrintNumbers(n-1);
    }
}
