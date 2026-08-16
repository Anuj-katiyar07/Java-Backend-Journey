class CopyConstructor {

    int age;
    String name;

    
    CopyConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
    CopyConstructor(CopyConstructor s) {
        this.age = s.age;
        this.name = s.name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        
        CopyConstructor s1 = new CopyConstructor(20, "Anuj");

        CopyConstructor s2 = new CopyConstructor(s1);

        System.out.println("First Object:");
        s1.display();

        System.out.println("\nCopied Object:");
        s2.display();
    }
}