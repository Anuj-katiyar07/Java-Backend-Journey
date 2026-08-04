import java.util.Scanner;
public class StudentInfo{
    
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    System.out.println("Original name:"+name);
    System.out. println("Length:"+ name.length());
    System.out.println("Uppercase:"+ name.toUpperCase());
    System.out.println("Lowercase:"+ name.toLowerCase());
    System.out.println("First Letter:"+ name. charAt(0));
    System.out.println("Last Letter:"+ name.charAt(name.length()-1));
    System.out.println("Start with A:"+name.startsWith("A"));
    System.out.println("End with J:"+name.endsWith("j"));
    sc.close();


}

}











