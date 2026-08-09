import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Java marks: ");
        int java = sc.nextInt();

        System.out.print("Enter SQL marks: ");
        int sql = sc.nextInt();
         
        System.out.print("Enter computer marks: ");
        int computer = sc.nextInt();

        int total = java+sql+computer;
    double percentage = total/3.0;

    if(percentage>=90){
        System.out.println("grade A");
    }
    else if(percentage>=75){
        System.out.println("grade B");
    }
    else if(percentage>=60){
        System.out.println("grade C");
    }
    else if(percentage>=40){
        System.out.println("grade D");
    }
    else {
        System.out.println("grade f");
    }
    if(java < 33 || sql < 33 || computer < 33){
        System.out.println("Fail");
    }
    else{
        System.out.println("pass");

    }


sc.close();
    }
}