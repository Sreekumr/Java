import java.io.*;

class twoprgm3{
	public static void main(String args[])
	  {
	    try
		{
		  System.out.println("Sreekumar");
		  DataInputStream din= new DataInputStream(System.in);
		  System.out.println("Enter the size of Array");
		  int n = Integer.parseInt(din.readLine());
		  int[] arr= new int[n];
		  for(int i=0;i<n;i++)
		  {
		     System.out.println("Enter the element for Array");
		     arr[i]=Integer.parseInt(din.readLine());

                   }
		   System.out.println("Enter the element to search");
		   int s = Integer.parseInt(din.readLine());
		   for(int i=0;i<n;i++)
		    {
			if(arr[i]==s)
			  {
			   System.out.println("Element is found at index " + i);
		          }
			}
		   }
       catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}