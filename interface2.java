interface Exam{
    void result();
}
interface Quiz extends Exam{
    void reward();
}

class Nquiz implements Quiz{ 

    // We cannot call functions inside main method
    // we cannot define functions inside other functions
    public void result(){
        System.out.println("I am void result method from class Nquiz");
    }
    public void reward(){
        System.out.println("I am void reward method from class Nquiz");
    }
    public static void main(String args[]) {
    Nquiz obj=new Nquiz();
    
    obj.result();
    obj.reward();

}
}