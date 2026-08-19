class ThisKeywordPractice1{
    int age = 20;
    void display(){
        int age = 25;
        System.out.println(age);
        System.out.println(this.age);
    }
    public static void main(String[]args){
        ThisKeywordPractice1 s = new ThisKeywordPractice1();
        s.display();
    }
}