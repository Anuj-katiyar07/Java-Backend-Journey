class PrivateConstructor {

    int age;
    String name;

    private PrivateConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        PrivateConstructor s1 =
                new PrivateConstructor(20, "Anuj");

        s1.display();
    }
}