
 class SimpleInheritance {

    int roll;
    String name;

    void input() {
        System.out.println("Roll & Name");
    }
}

class B extends SimpleInheritance {

    void display() {
        roll = 1;
        name = "Anuj";

        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        B r1 = new B();

        r1.input();
        r1.display();
    }
}