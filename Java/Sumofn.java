import java.util.Scanner;

public class Sumofn{
    public static int Sumofn(int n){
        if(n==0){
            return 0;
        }
        return n + Sumofn(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int result = Sumofn(n);
        System.out.println("Sum of numbers from 1 to "+n+" is: "+result);
    }
}