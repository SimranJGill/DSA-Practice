import java.util.Scanner;

public class numberstilln{
    public static void printNumbers(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        //printNumbers(n);
    }
}