class BBC1
{
     public String method(int a, int b)
    { return "Base Class - BBC1"; }
}
class BBC2 extends BBC1
{ 
    private static int counter = 0;
    public String method(int x){ 
        return "Derived Class - BBC2"; 
    }

public static void main(String[] args)
{ 
    BBC1 bg = new BBC2(); 
    System.out.println(bg.method(5,6)); }
}
