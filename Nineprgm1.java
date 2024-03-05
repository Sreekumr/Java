/*Write a Java program that creates a class named 'Employee' having the following members:
 Name, Age, Phone number, Address, and Salary. It also has a method named 'print- Salary( )'
  which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherit the 'Employee' class.
   The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
   Now, assign a name, age, phone number, address, and salary to an officer and a manager 
   by making an object of both of these classes and printing the same. 
 */
import java.util.*;
import java.io.*;

class Employee{
    String name, address;
    int age,phno,salary;


    public void  print(){
        System.out.println("Salary:"+salary);
    }
}

class Officer extends Employee{
   String spec,dept;
   public Officer(){
        dept =null;
        spec= null;
   }
}

class Manager extends Employee{
    String spec,dept;
    public Manager(){
        dept =null;
        spec= null;
   }
}
public class Nineprgm1 {
    public static void main(String args[]){
       Scanner s= new Scanner(System.in);
       Manager mg= new Manager();
       Officer ofc= new Officer();

    try{
       System.out.println("Officer Detials:");
       System.out.println("Enter Name of Employee: ");
       ofc.name= s.nextLine();
       System.out.println("Enter address:");
       ofc.address= s.nextLine();
       System.err.println("Enter the age:");
       ofc.age= s.nextInt();
       System.out.println("Enter Phone No.:");
       ofc.phno= s.nextInt();
       System.out.println("Enter Department:");
       ofc.dept= s.nextLine();
       s.nextLine();
       System.out.println("Enter Specialization:");
       ofc.spec= s.nextLine();
       System.out.println("Enter Salary:");
       ofc.salary= s.nextInt();

       System.out.println("\nManger Detials:");
       System.out.println("Enter name:");
       mg.name= s.nextLine();
       s.nextLine();
       System.out.println("Enter address:");
       mg.address= s.nextLine();
       System.err.println("Enter the age:");
       mg.age= s.nextInt();
       System.out.println("Enter Phone No.:");
       mg.phno= s.nextInt();
       System.out.println("Enter Department:");
       mg.dept= s.nextLine();
       s.nextLine();
       System.out.println("Enter Specialization:");
       mg.spec= s.nextLine();
       System.out.println("Enter Salary:");
       mg.salary= s.nextInt();
       
       System.out.println("Salary of Office");
       ofc.print();
       System.out.println("Salary of Manager");
       mg.print();
    }
    catch(Exception e){
        System.out.println(e);
    }
       s.close();
    }
}
