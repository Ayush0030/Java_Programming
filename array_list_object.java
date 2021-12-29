import java.util.*;
class Student{
     private String name;
     private String contact;
     private String email;
    // Student(){
        Student(String name, String contact, String email){
            this.name=name;
            this.contact=contact;
            this.email=email;
            // this.display();
        }
        // public String get_name(){
        //     return name;
        // }
        // public String get_contact(){
        //     return contact;
        // }
        // public String get_email(){
        //     return email;
        // }
    // }
    public void display(){
        System.out.println(name+" "+contact+" "+email);
    }


    // To string method below
    public String toString(){
        return name+""+contact;
    }

}
class Main{
    public static void main(String args[]) {
        Student obj=new Student("Ayush","8968456350","ad333@gmail.com");
        Student obj2=new Student("Butru","7894132","butru@gmail.com");

        // obj.set("Ayush","8968456350","ad333@gmail.com");
        // System.out.println(obj.get_name()+" "+obj.get_contact()+" "+obj.get_email());

        ArrayList<Student> a1= new ArrayList<Student>();
        a1.add(obj);
        a1.add(obj2);
        System.out.println(a1.contains(obj));
        System.out.println(a1.isEmpty());  
     // obj.display();
        // obj2.display();
        for (Student student : a1) {
            student.display();
        }

        System.out.println("toString() method below\n\n");
        System.out.println(obj);
    }

}

