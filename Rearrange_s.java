import java.util.Scanner;
import java.util.*;

class Rearrange{
	public static void Scan()
	{
		System.out.println("enter number of inputs to find greatest");
		Scanner input = new Scanner(System.in);
	     int A ;
	    A = input.nextInt();
		 int B[]= new int[A];
		for(int i=0;i<A;i++)
		{
			System.out.println("no. "+i +" = " );
			B[i] =input.nextInt();
        }
	}
	public static void Method(int A)
	{

		// int greater;
        // greater=B[0];
        // for(int i=0;i<A;i++)
        // {
        // 	if(B[i]>greater)
        // 		{
        // 			greater=B[i];
        // 		}	
        // }
        // System.out.print("greatest = " +greater);
        System.out.println("The value of A from Scan method="+ A);
	}

	public static void main(String arg[])
	{
	    Rearrange obj =new Rearrange();
         obj.Scan();
         // int A=5;
         // int B[] = {4,5,6,7,8};
        obj.Method(int A);
       
}
}