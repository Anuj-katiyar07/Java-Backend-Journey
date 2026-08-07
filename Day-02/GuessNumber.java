import java.util.Scanner;
public class GuessNumber{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int secretNumber = 7;
        int guess;
        do{
            System.out.print("Guess the number(1,10):");
            guess = sc.nextInt();
            if(guess>secretNumber){
                System.out.println("Too High! ");
            
            }else if(guess<secretNumber){
                System.out.println("Too Low!");
            }else{
                System.out.println("Cngragulation guess the number.");

            }
                
        }while(guess!=secretNumber);
sc.close();
    }
}