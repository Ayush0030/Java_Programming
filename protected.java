class A{
    protected String name;
    protected int age;

    // class B{
    //     public void methodB(String name, int age){
    //         this.name=name;
    //         this.age=age;
    //     }
    // }
}
class C extends A{
    public void methodC(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);
    }
}
class Main{
    public static void main(String args[]) {
        C obj= new C();
        obj.methodC("Ayush", 21);
    }
}
