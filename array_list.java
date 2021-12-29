import java.util.*;
class array_list{
    public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<Integer>();
    myList.add(15);
    myList.add(100);
    //myList.add("Ayush"); This shows error because type allowed is Integer
    System.out.println(myList);


    // New Array list below with no input type
    // this is known as non generic coz we can add up multiple data types
    ArrayList myList2 = new ArrayList();
    myList2.add(15);
    myList2.add(100);
    myList2.add("SarthakButru");
    // myList.add("Ayush"); This shows error because type allowed is Integer
    System.out.println(myList2);


    // ArrayList Iterator Use
    ArrayList<Integer> myList3 = new ArrayList<Integer>();
    myList3.add(15);
    myList3.add(100);
    // Iterator itr = myList3.iterator();
    // with iterator we only use has next and next();
    
    System.out.println("The Size of myList3 is ==  "+myList3.size());
    for(int i=0;i<myList3.size();i++){
        System.out.println(myList3.get(i));
        // itr++;
    }

    System.out.println("\nStack is Below\n");
    Stack<String> myList4 = new Stack<String>();  
    myList4.push("Ayush");  
    myList4.push("Sarthak");  
    myList4.push("Anup"); 
    myList4.push("TCILIT"); 
    myList4.pop(); //Deletes TCILIT from the Array  

    System.out.println("The name at the Peek is "+myList4.peek());  //Peak Returns Value at Top in the Stack
    Iterator<String> itr= myList4.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  


    System.out.println("\nQueue Below\n");
    PriorityQueue<String> myList5=new PriorityQueue<String>();  
        myList5.add("Ayush");  
        myList5.add("Sarthak");  
        myList5.add("Anup");  
        myList5.add("Tcil");  
        System.out.println("element() method == " + myList5.element());  
        System.out.println("peek() method == "+myList5.peek());  
        // System.out.println("iterating the queue elements:");  
        Iterator itr2=myList5.iterator();  
        while(itr2.hasNext()){  
        System.out.println(itr2.next());  
        }  
        // myList5.remove();  
        // myList5.poll();  
        // System.out.println("after removing two elements:");  
        // Iterator<String> itr2=myList5.iterator();  
        // while(itr2.hasNext()){  
        // System.out.println(itr2.next());  
        // }  
        // }
        
        
        System.out.println("\nArrayList is Below\n");
        ArrayList<String> myList6 = new ArrayList<String>();  
        myList6.add("Ayush");  
        myList6.add("Sarthak");  
        myList6.add("Anup"); 
        myList6.remove("Sarthak"); //Sarthak gets removed from the ArrayList
        System.out.println(myList6.contains("Ayush")); //checks "Ayush" is present or not
        // myList6.parallelStream();
        // myList6.stream();
        System.out.println();
        System.out.println(myList6.stream());
        // myList6.spliterator();
        System.out.println("Hashcode for myList6"+myList6.hashCode());//return hashcode
        Iterator itr3= myList6.iterator();  
        while(itr3.hasNext()){  
        System.out.println(itr3.next());  
        }  
    }
}