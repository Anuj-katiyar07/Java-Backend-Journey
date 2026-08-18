class HierarchicalInheritance{
    String name;
    void display(){
        System.out.println("Enter your name ");
    }
}
class B extends HierarchicalInheritance{
    String name  = "Anuj";
    void show(){
        System.out.println("Name:"+name);
    }

}class C extends HierarchicalInheritance{
    String name = "soni";
    void input(){
        System.out.println("Name :"+name);
    }
    public static void main(String[]args){
        B b = new B();
b.display();
b.show();

C c = new C();
c.display();
c.input();
    }

}