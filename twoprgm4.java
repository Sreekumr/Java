import java.io.*;

class twoprgm4
  {
    public static void main(String args[])
     {
       try{
           DataInputStream din= new DataInputStream(System.in);
	   System.out.println("Sreekumar");
	   System.out.println("Enter the size of Array");
           int n=Integer.parseInt(din.readLine());
           int[] arr=new int [n];
           for(int i=0;i<n;i++)
           {
             System.out.println("Enter the elements");
             arr[i]=Integer.parseInt(din.readLine());
           }
          System.out.println("SORTED ARRAY");
         for(int i=0;i<n;i++)
         {
          for(int j=0;j<(n-1)-i;j++)
             {
               if(arr[j]>arr[j+1])
                {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
              }
            }
          for(int i=0;i<n;i++)
           {
             System.out.println(" "+arr[i]);
           }
     }
  catch(Exception e)
        {
            System.out.println("Error"+e);
        }
      }
    }

           