class first extends Thread{
    public void run(){
        System.out.println("hello");

        for(int i=1;i <=5;i ++){
            System.out.println(i);
    
        }
    }
}
class second implements Runnable{
    public void run(){
            System.out.println("world");
            for(int i=1;i <=5;i ++){
                System.out.println(i);
            }
        }
}

class multimain{
    public static void main(String args[]) {
        first f1 = new first();
        f1.start();

        second s1 = new second();
        Thread obj = new Thread(s1);
        obj.start();
    }
}