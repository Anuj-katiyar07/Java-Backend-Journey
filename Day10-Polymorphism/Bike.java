class Bike{
    void start(){
    System.out.println("Bike is start with self start");
}
}
class car extends Bike{
    @Override
    void start(){
        System.out.println("Car is start");
    }

    public static void main(String []args){
        Bike s1 = new car();
        Bike s2 = new Bike();

        s1.start();
        s2.start();
    }
}