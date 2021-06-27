//Program to Sort strings./

import java.util.*;

class Sortstring
{
public static void main(String args[]) 
{
int n;
String temp;
Scanner s = new Scanner(System.in);
System.out.print("No of strings: ");
n=s.nextInt();
String str[] = new String[n];
System.out.print("Enter the Strings: ");
for(int i = 0; i < n; i++)
{
str[i] = s.next();
}
for(int i=0 ; i< n ; i++) 
{
for (int j=i+1 ; j<n ; j++) 
{
if (str[i].compareTo(str[j])>0) 
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("strings in sorted order : ");
for (int i=0 ; i<n-1; i++) 
{ 
System.out.println(str[i]);
}
System.out.print(str[n-1]);
}
}