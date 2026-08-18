class MultilevelInheritance{
    int roll;
    String name;
    void show(){
        System.out.println("Enter roll & name");
    }
}
class B extends MultilevelInheritance{
    void display(){
        int roll = 1;
        String name = "anuj";
        System.out.println("Roll:"+roll);
        System.out.println("Name:"+name);
    }
}
class C extends B{
    int marks = 20;
    void input(){
        System.out.println("Mraks:"+marks);
    }
    public static void main(String[]args){
        C r = new C();
        r.show();
        r.display();
        r.input();
    }
}