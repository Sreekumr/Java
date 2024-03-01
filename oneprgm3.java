import java.io.*;
class oneprgm3 {
      public static void main(String args[])
       {
        try
         {
          System.out.println("Sreekumar");
	  int a;
	  int b;
	  DataInputStream d=new
DataInputStream(System.in);
 	  System.out.println("Enter 1st number");
	  a=Integer.parseInt(d.readLine());
	  System.out.println("Enter 2nd number");
	  b=Integer.parseInt(d.readLine());
	  System.out.println("Sum of "+ a + " and " + b + " is " + (a+b));
         }
    catch(Exception e)
 	{
	  System.out.println("Error"+e);
	}
     }
}
   	  