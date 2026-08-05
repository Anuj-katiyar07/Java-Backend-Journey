import java.util.Scanner;
public class LeapYear{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter year:");
    int Year = sc.nextInt();
    if(Year % 400 == 0){ 
        System.out.println("Leap year:");}
        else if(Year % 100 == 0){
            System.out.println("NOt Leap year");}
          else if(Year % 4 == 0){
                System.out.println("Leap year");}
                else{
                    System.out.println("NOt Leap year");}
                sc.close();
            }
        }
    