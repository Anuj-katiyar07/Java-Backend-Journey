class SuperKeywordPractice1{
    int age = 20;
}
    class SuperChild1 extends SuperKeywordPractice1 {
    int age = 25;

    void display() {
        System.out.println(age);
        System.out.println(super.age);
    }

    public static void main(String[] args) {
        SuperChild1 s = new SuperChild1();
        s.display();
    }
    }
