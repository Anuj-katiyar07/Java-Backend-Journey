class Animal{
    void sound(){
        System.out.println("Overall animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meou");
    }
}
class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow gives moo sound ");
    }
}
class Demo{
    public static void main(String[]args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        a1.sound();
        a2.sound();
        a3.sound();
    }
}