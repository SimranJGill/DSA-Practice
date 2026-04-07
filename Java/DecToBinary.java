import java.util.Scanner;

public class DecToBinary{
    public static void main(String[] args){
        System.out.println("Enter decNum: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = "";
        while(num>0){
            int rem = num % 2;
            binary = rem + binary;
            num /= 2;
        }
        System.out.println("Binary Equivalent: " + binary);
    }
}