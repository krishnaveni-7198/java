/*4. Program to create a class for Employee having attributes eNo, eName, eSalary. 
Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.*/

import java.util.*;

class Employee 
{
int eNo;
String eName;
float eSalary;
 
public void getdata() 
{
Scanner s = new Scanner(System.in);
System.out.println("enter the employee number : ");
eNo=s.nextInt();
System.out.println("enter the employee name : ");
eName=s.next();
System.out.println("enter the employee salary : ");
eSalary=s.nextFloat();
} 
public void display() 
{
System.out.println("\nemployee number : " +eNo);
System.out.println("employee name : " +eName);
System.out.println("employee salary : " +eSalary);
}
public static void main(String args[]) 
{
int n=0;
Scanner s1 = new Scanner(System.in);
System.out.println("enter the limit :");
n=s1.nextInt();
Employee e[]=new Employee[n];
for(int i=0; i<n; i++) 
{
e[i]=new Employee();
e[i].getdata();
}
System.out.println("\n**EMPLOYEE DETAILS**");
for(int i=0; i<n; i++) 
{
e[i].display();
}
}
}