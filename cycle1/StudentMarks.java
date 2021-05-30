import java.util.Scanner;

public class StudentMarks
{
public static void main(String args[]) 
{
String name;
int n, rollno, total=0 ;
float percentage;
Scanner s=new Scanner(System.in);
System.out.print("enter name of the student : ");
name=s.nextLine();
System.out.print("enter roll number : ");
rollno=s.nextInt();   
System.out.print("enter the number of subjects : ");
n=s.nextInt();
int marks[]=new int[n];
System.out.println("***enter marks secured in each subject out of 100***");
for(int i = 0; i < n; i++)
{
marks[i] = s.nextInt();
total = total + marks[i];
}
percentage = total / n;

System.out.println("roll number : " +rollno);
System.out.println("name of the student : "+name);
System.out.println("total marks obtained : "+total);
System.out.println("percentage : "+percentage);
}
}