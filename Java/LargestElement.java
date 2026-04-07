import java.util.Scanner;

public class LargestElement{
    public static int findLargest(int[] arr){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element of array is: "+ findLargest(arr));
    }
}