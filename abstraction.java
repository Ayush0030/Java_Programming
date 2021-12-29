import java.util.Scanner;
abstract class Car{
    String name;
    String model;
    Scanner input= new Scanner(System.in);    

    void info(){
        name=input.nextLine();
        model=input.nextLine();
        System.out.println(name);
        System.out.println(model);
    }
    abstract void comments();
}

class car1 extends Car{
    void comments(){
        System.out.println("Hi i am Car-1");
    }
}
class car2 extends Car{
    void comments(){
        System.out.println("Hi i am Car-2");
    }
}
class car3 extends Car{
    void comments(){
        System.out.println("Hi i am Car-3");
    }
}
class abstraction{
    public static void main(String args[]){
        car1 obj1=new car1();
        obj1.info();
        obj1.comments();


        // We Cannot Create an Object for abstraction class, demo below
        // Car obj_Car=new Car();
        // obj_Car.info();
        // obj_Car.comments();
    }
}