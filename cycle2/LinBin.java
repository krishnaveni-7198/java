/*2. Search an element in an array -
write a menu driven program to perform both linear search and binary search of a string in a String array.*/

import java.util.Arrays;
import java.util.Scanner;

class LinBin
{
public static void main(String args[]) 
{ 
Scanner s=new Scanner(System.in);
int i,n,ch,flag=0;
String search;

System.out.print("enter the limit : ");
n=s.nextInt();
String str[]=new String[n];
System.out.println("enter all the elements : ");
for(i=0; i<n; i++)
{
str[i]=s.next();
}

do
{
System.out.println("\n**ARRAY ELEMENT SEARCH**");
System.out.println("\n 1.Linearsearch\n 2.Binarysearch\n 3.Exit");
System.out.println("\nenter your choice : " );
ch=s.nextInt();
switch(ch)
{
case 1:
	System.out.print("enter the element to be searched : ");
    search=s.next();
	for(i=0; i<n; i++)
	{
	if(str[i].equals(search))
	{
	flag=1;
	break;
	}
	else
	{
	flag=0;
	}
	}
	if(flag==1)
	{
	System.out.println("element " +search+ " found at position "+(i)+" !!! ");
	}
	else
	{
	System.out.println("element not found!!!");
	}
	break;
case 2:
	System.out.print("enter the element to be searched : ");
    search=s.next();
	Arrays.sort(str);
	int searchIndex = binarySearch(str,search);
    System.out.println(searchIndex != -1 ? str[searchIndex]+ " \nindex is "+searchIndex : "element not found !!!");
    break;
case 3:
	break;
default:
	System.out.println("invalid option !!!");
	break;
}
} 
while(ch!=3);
}
public static int binarySearch(String a[], String x) 
{
int low=0;
int high=a.length-1;
int mid;
while (low<=high) 
{
mid=(low + high)/2;
if (a[mid].compareTo(x)<0) 
{
low = mid + 1;
} 
else if (a[mid].compareTo(x)>0) 
{
high=mid-1;
} 
else 
{
return mid;
}
}
return -1;
}
}