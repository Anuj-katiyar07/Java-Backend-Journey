class ThisKeywordConstructorPractice2{
    int age;
    String name;
    ThisKeywordConstructorPractice2(int age,String name){
        this.age = age;
        this.name =name;
    }
    void display(){
        System.out.println("Age:" +age);
         System.out.println("Name:" +name);
    }
    public static void main(String[]args){
        ThisKeywordConstructorPractice2 s = new ThisKeywordConstructorPractice2(25,"aditya");
        s.display();
    }

}