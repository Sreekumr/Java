import java.io.*;

class oneprgm4 {
    public static void main(String args[])
    {
        try{
            DataInputStream d=new DataInputStream(System.in);
            int a;
            int b;
            int temp;
            System.out.println("Sreekumar");
            System.out.println("Enter value of A");
            a=Integer.parseInt(d.readLine());
            System.out.println("Enter value of B");
            b=Integer.parseInt(d.readLine());
            temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping A= "+ a +" B= "+ b);
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }    
}