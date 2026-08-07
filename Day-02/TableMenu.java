import java.util.Scanner;
public class TableMenu{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        System.out.println("\n=====Menu=====");
        System.out.println("1. Table up to 10:");
        System.out.println("2. Table up to 20:");
        System.out.print("Enter a choice");
        int Choice = sc.nextInt();
        switch(Choice){
            case 1:
            for( int i = 1;i<=10;i++){
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            break;
            case 2:
            for(int i = 1; i<=20;i++){
                System.out.println(num + " x " + i + " = " + (num * i));
            }break;
            default:
            System.out.println("Invalid number !");

            }sc.close();
        } 

    }

    
