import java.util.Scanner;

public class ASSIGNMENT_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of the elements:");
        n = sc.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++ ) {
            arr[i]=sc.nextInt();
        }
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Elements of array sorted in ascending order: ");
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
