import java.util.Scanner;

public class ArraySearchReverse {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean found = false;

        // Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(n + " found");
        } else {
            System.out.println(n + " not found");
        }

        // Reverse Array
        System.out.print("Reverse Array: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}