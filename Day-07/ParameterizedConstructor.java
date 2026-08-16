/**
 * ParameterizedConstructor
 */
public class ParameterizedConstructor {
    int age;
    String name;
    ParameterizedConstructor(int age, String name){
        this.age = age;
        this.name = name;
    }void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
    
        public static void main(String[]args){
            ParameterizedConstructor d1 = new ParameterizedConstructor(20,"Anuj");
            d1.display();

        }
    }

