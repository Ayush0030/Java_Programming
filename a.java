import java.util.*;
//Question:
//Complete the following code to ensure that bank will have atmost 5 objects:

class Bank{
    public static int counter=0;
    //Constructor
    Bank()
    {
    // write your code here.
    System.out.println("Constructor say Hello!");
    }

    // Parameterize Constructor
    Bank(String name, int age)
    {
    //write your code here.
        System.out.println(name+"  "+age);
        counter++;
        if(counter==5){
            System.out.println("Limit for 5 objects exceeded");
            System.exit(0);
        }
    }

public static void main(String arg[])
{
// write the code in such a way that bank must have atmost 5 objects
    ArrayList<Bank> list= new ArrayList<Bank>();

    list.add(new Bank("Ayush",30));
    list.add(new Bank());//this is also obj
    list.add(new Bank("Cat",50));
    list.add(new Bank("Dog",30));
    list.add(new Bank("Elephant",20));
    list.add(new Bank("Flies",50));
    // This object wont be made as limit is for 5 objects

    System.out.println("The Size of the list is == "+list.size());
    int i=0;
    while(i<list.size()){
        System.out.println("The element at index["+i+"] is == "+list.get(i));
        i++;
    }
    
    
    
}
}