public class MethodPractice10{
    public static int add(int a,int b){
       return a+b; 
    }
    public static int sub(int a,int b){
       return a-b; 
    }
public static int mul(int a,int b){
       return a*b; 
    }public static int division(int a,int b){
       return a/b; 
    }
    public static void main(String[]args){
        int sum = add(5,7);
        int result = sub(27,6);
        int mul = mul(6,7);
        int division = division(27,3);
        System.out.println("add is:"+sum);
        System.out.println("sub is:"+result);
        System.out.println("mul is:"+mul);
        System.out.println("division is:"+division);
    }
}