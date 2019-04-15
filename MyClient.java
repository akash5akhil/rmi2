import java.rmi.*;  
import java.util.Scanner;
public class MyClient{  
public static void main(String args[]){ 
Scanner sc = new Scanner(System.in); 
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println("enter two numbers to add");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(a+","+ b);  
System.out.println(stub.add(a,b));  
}catch(Exception e){}  
}  
}  