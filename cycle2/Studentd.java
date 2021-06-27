/*5.Design a class to represent a Student details. include the Student ID, name of the Student, branch, year and assign initial values,
calculate average of marks of 6 subjects, and display grade. Also print the details of the students in the first and second position. 
Program prints the grade based on this logic.
a.	If the average of marks is >= 80 then prints Grade ‘A’
b.	If the average is <80 and >=60 then prints Grade ‘B’
c.	If the average is <60 and >=40 then prints Grade ‘C’
d.	else prints Grade ‘D’*/

import java.util.*;

class Studentd
{
int tot,i,avg,yr,sid;
String sname,branch;
int marks[]= new int[6];
Scanner s = new Scanner(System.in);
public void getdata() 
{
System.out.println("\nenter the student id : ");
sid=s.nextInt();
System.out.println("enter the student name : ");
sname=s.next();
System.out.println("enter the student branch : ");
branch=s.next();
System.out.println("enter the student year : ");
yr=s.nextInt();

for(i=0; i<6; i++) 
{ 
System.out.print("enter marks of subject"+(i+1)+" : ");
marks[i]=s.nextInt();
tot=tot+marks[i];
}
avg=tot/6;
}   

public void display() 
{
System.out.println("\nstudent id : " +sid);
System.out.println("student name : " +sname);
System.out.println("student branch : " +branch);
System.out.println("student yr : " +yr);
if(avg>=80)
{
System.out.print("\nstudent grade is A.\n");
}
else if(avg>=60 && avg<80)
{
System.out.print("\nstudent grade is B.\n");
} 
else if(avg>=40 && avg<60)
{
System.out.print("\nstudent grade is C.\n");
}
else
{
System.out.print("\nstudent grade is D.\n");
}
}
public static void main(String args[])
{
int n=0,maxi1=0,maxi2=0;
float max1=0,max2=0;
Scanner s1 = new Scanner(System.in);
System.out.print("enter the limit :");
n=s1.nextInt();
Studentd s[]=new Studentd[n];
for(int i=0; i<n; i++) 
{
s[i]=new Studentd();
s[i].getdata();
}
System.out.println("\n*STUDENT DETAILS*");
for(int i=0; i<n; i++) 
{
s[i].display();
}
for(int i=1;i<n;i++)
{
if(s[i].avg<s[i-1].avg)
{
max1=s[i].avg;
maxi1=i;
}
else
{
max1=s[i-1].avg;
maxi1=i-1;
}
max2=max1;
maxi2=maxi1;
}
for(int i=0; i<n; i++) 
{
if(max1<=s[i].avg)
{
max1=s[i].avg;
maxi1=i;
}
}
for(int i=0; i<n; i++) 
{
if(max2<=s[i].avg && max1!=s[i].avg)
{
max2=s[i].avg;
maxi2=i;
}
}
System.out.println("\nFIRST POSITION:");
s[maxi1].display();
System.out.println("AVERAGE MARK :"+max1);
System.out.println("SECOND POSITION:");
s[maxi2].display();
System.out.println("AVERAGE MARK :"+max2);
}
}
