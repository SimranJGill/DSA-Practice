// fibonacci series - 0 1 1 2 3 5 8 13 21 .....
// sum of first 5 terms = 0+1+1+2+3 = 7

import java.util.Scanner;

public class Fibonacci{
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci of "+n+" is: "+result);
    }
}
