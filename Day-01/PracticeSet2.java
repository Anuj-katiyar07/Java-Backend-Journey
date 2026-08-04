import java.util.Scanner;
public class PracticeSet2
{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Number:");
    float a = sc.nextFloat();
    System.out.println("Enter second Number:");
    float b = sc.nextFloat();
    float result = a/b*9/2f;
    System.out.println("Result ="+result);
    sc.close();
    
}
}