class Employee {

    void show(int age) {
        System.out.println("Age: " + age);
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Employee s = new Employee();

        s.show(25);
        s.show("Anuj");
        s.show("Anuj", 25);
    }
}
