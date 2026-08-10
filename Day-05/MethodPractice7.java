public class MethodPractice7 {

    public static int largestnumber(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
        }
       public static void main(String[]args){
        int largestNumber = largestnumber(7, 5);
System.out.println("Largest number: " + largestNumber);
       }
    }
