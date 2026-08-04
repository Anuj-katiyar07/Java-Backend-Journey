import java.util.Scanner;
public class Radius{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius:");
        float radius = sc.nextFloat();
        float area = 3.14f*radius*radius;
        System.out.println("Area="+area);
        sc.close();
    }
}