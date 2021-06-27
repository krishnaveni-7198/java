//3.Perform string manipulations/

import java.util.*;

class StringManipulation
{
public static void main(String args[]) 
{
String str,str1,str2,str3,r,t;
char c;
int p,q,ch,n;
Scanner s = new Scanner(System.in);

do
{
System.out.println();
System.out.println("STRING MANIPULATION");
System.out.println("\n1.create new string\n2.getting a string length\n3.string concatenation\n4.character extraction\n5.string comparision\n6.searching substrings\n7.modifying a string\n8.data conversion using valueOf()\n9.Exit");
System.out.println("enter your choice :");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("enter any string : ");
str=s.next();
String s1 = new String(str);
System.out.println("new string : "+s1);
break;
	
case 2:
System.out.println("enter any string : ");
str=s.next();
System.out.println("length of string : " + str.length());
break;
	
case 3:
System.out.println("enter 1st string : ");
str1=s.next();
System.out.println("enter 2nd string : ");
str2=s.next();
str3=str1.concat(str2);
System.out.println("concatenation using concat() : "+str3);
break;
	
case 4:
System.out.println("enter any string : ");
str=s.next();
System.out.println("enter the position :");
p=s.nextInt();
c=str.charAt(p-1);
System.out.println("character extraction : "+c);
break;
	
case 5:
System.out.println("enter 1st string : ");
str1=s.next();
System.out.println("enter 2nd string : ");
str2=s.next();
System.out.println("string comparsion : "+str1.compareTo(str2));
break;
	
case 6:
System.out.println("enter any string : ");
str=s.next();
System.out.println("enter the position of substring :");
q=s.nextInt();
System.out.println("searching substrings : "+str.substring(q-1));
break;
	
case 7:
System.out.println("enter any string : ");
str1=s.next();
System.out.println("enter the character to be replaced :");
r=s.next();
System.out.println("enter the character to be replaced with :");
t=s.next();
str2=str1.replace(r,t);
System.out.println("replacing strings : "+str2);
break;

case 8:
System.out.println("enter any number : ");
n=s.nextInt();
str=String.valueOf(n);
System.out.println("data conversion using valueOf() : "+str);
break;

case 9:System.out.println("Exiting");break;
default:
System.out.println("invalid choice !!!");
break;

}
}
while(ch!=9);
}
}