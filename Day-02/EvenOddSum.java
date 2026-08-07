import java.util.Scanner;
public class EvenOddSum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int EvenSum = 0;
        int OddSum = 0;
        for( int i = 1; i<=num; i++){
            if( i % 2 == 0){
                EvenSum = EvenSum + i;
            }else{
            
                OddSum = OddSum + 1;

        }
        System.out.println("Sum of even numbar ="+ EvenSum);
    }System.out.println("Sum of odd number ="+ OddSum);
    }
}