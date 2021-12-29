class exception{
    public static void main(String args[]) {
        try {
            String str="Hello World!";
            System.out.println(str.length());
            char c=str.charAt(0);
            System.out.println(c);
            c=str.charAt(15);
            //this index is not avaiilable so error
            System.out.println(c);


        } catch (Exception e) {
            //TODO: handle exception

            System.out.println(e.getMessage());
            System.out.println("hi this is ayush and the error is string index out of bound exception");
        }
    }
}