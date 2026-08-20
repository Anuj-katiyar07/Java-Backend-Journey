class SuperKeywordConstructorPratice2{
    SuperKeywordConstructorPratice2(){
        System.out.println("Parent constructor");
    }
}
class child extends SuperKeywordConstructorPratice2{
    void display(){
        System.out.println("Child constructor");
    }
        public static void main(String[]args){
            child s = new child();
            
        }
}