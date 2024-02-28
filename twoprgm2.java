import java.io.*;
class twoprgm2 {
	public static void main(String args[])
	{
          try{
              System.out.println("Sreekumar");
		int n1;
		int n2;
		int n3;
		DataInputStream din=new DataInputStream(System.in);
		System.out.println("Enter 1st Number");
		n1=Integer.parseInt(din.readLine());
		System.out.println("Enter 2nd Number");
		n2=Integer.parseInt(din.readLine());
		System.out.println("Enter 3rd Numver");
		n3=Integer.parseInt(din.readLine());
                int min=n3<(n1<n2 ? n1:n2)?n3:(n1<n2?n1:n2);
              System.out.println(min +" is Minimum");

	
   }
	catch(Exception e)
	{
 	  System.out.println("Error"+e);
	}
    }
}		