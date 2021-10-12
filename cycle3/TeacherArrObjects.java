package app1;

import java.util.Scanner;
class Employee1
{
int empid;
String name;
double salary;
String address;
Employee1() 
{ }
Employee1(int empid,String name,double salary,String address)
{
    this.empid=empid;
    this.name=name;
    this.salary=salary;
    this.address=address;
}
}
class Teacher extends Employee1
{
    String department,subject;
    Teacher(int empid,String name,double salary,String address,String department,String subject)
    {
        super(empid,name,salary,address);
        this.department=department;
        this.subject=subject;
    }
    public void display()
    {
        System.out.println("Teacher's ID :" + empid );
        System.out.println("Teacher's name :" + name );
        System.out.println("Teacher's salary :" + salary );
        System.out.println("Teacher's Address :" + address );
        System.out.println("Teacher's Department :" + department );
        System.out.println("Teacher's subject :" + subject );
    }
}
public class TeacherArrObjects{
    public static void main(String[]args)
    {
        System.out.println("Enter the no.of teachers");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Teacher teacher[]=new Teacher[n];
//        Scanner sc=new Scanner(System.in);
        int tid,i;
        String name,address,department,subject;
        double salary;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter" + i +"teachers details" );
            System.out.println("Enter the teacher's EmpID");
            tid= s.nextInt();
            System.out.println("Enter the teacher's Name");
            name=s.next();
            System.out.println("Enter the teacher's Salary");
            salary=s.nextDouble();
            System.out.println("Enter the teacher's Address");
            address=s.next();
            System.out.println("Enter the teacher's Department");
            department=s.next();
            System.out.println("Enter the teacher's Subject");
            subject=s.next();
            Teacher t = new Teacher (tid,name,salary,address,department,subject) ;
            teacher[i]=t;

        }
        System.out.println("Teachers are:\n");
        for(Teacher x:teacher){
            x.display();
        }
    }
}