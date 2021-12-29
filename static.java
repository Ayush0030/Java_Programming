class Ayush{
    int age_normal=21;
    static int age_static=123;
     int add_func(int a, int b){
        return a+b;
    }
    static int add_func_static(int a, int b){
        // We cannot make any var static inside the static method!!! for eg below
        // static int c=30;
        // System.out.println("Static Variable inside Static Method"+c);
        return a+b;
    }

class Internal{
    void internal_class_function(){
        System.out.println("\nHi i am the internal class!!\n");
}
}


public static void main(String args[]) {
    // System.out.println(age_normal); Cannot Print this because it is not static
    System.out.println(age_static);
    // System.out.println(add_func(10,20)); Cannot Print this because it is not static
    System.out.println(add_func_static(30,50));

    Ayush new_obj = new Ayush();

    // To create an object for internal class we write outer_obj.new then internal class. as below
    Ayush.Internal new_obj_internal = new_obj.new Internal();
    new_obj_internal.internal_class_function();


    System.out.println("From New Object the int Normal Age is " + new_obj.age_normal);

    //Objects Cannot be used to call static variables from the class
    //  To call static Variable in main we must call them directly (By not using obj)
    // System.out.println("From New Object the static Age is " + new_obj.age_static);

    System.out.println("From New Object the normal add_func() is " + new_obj.add_func(10,20));



}

}
