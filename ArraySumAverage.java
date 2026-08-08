import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size array :");;
        int n =sc. nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter"+ n + "element");
        for( int i = 0;i<n;i++){
            arr [i] = sc.nextInt();
            sum = sum + arr[i];
        }Double average = (double)sum/n;
        System.out.println("sum="+sum);
        System.out.println("average="+average);
        sc.close();

    }
    
}
