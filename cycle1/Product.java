/*Define a class ‘product’ with data members pcode, pname and price. 
Create 3 objects of the class and find the product having the lowest price.*/

import java.util.*;

public class Product
{
int pcode;
String pname;
int price;

Product()
{
pcode=0;
pname=null;
price=0;
}


 
public static void cal(int a,int b,int c)
{
int p1=a;
int p2=b;
int p3=c;
int lowest;
if(p1<p2)
{
if(p3<p1) 
{
lowest = p3;
} 
else 
{
lowest = p1;
}
} 
else 
{
if(p2<p3) 
{
lowest = p2;
} 
else
{
lowest = p3;
}
}
System.out.println("The lowest price is "+lowest);
}
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Product p1= new Product();
Product p2= new Product();
Product p3= new Product();
System.out.print("enter the product1 id : ");
p1.pcode=s.nextInt();
System.out.print("enter the product1 name : ");
p1.pname=s.next();
System.out.print("enter the product1 price : ");
p1.price=s.nextInt();
System.out.print("enter the product2 id : ");
p2.pcode = s.nextInt();
System.out.print("enter the product2 name : ");
p2.pname=s.next();
System.out.print("enter the product2 price : ");
p2.price=s.nextInt();
System.out.print("enter the product3 id : ");
p3.pcode = s.nextInt();
System.out.print("enter the product3 name : ");
p3.pname=s.next();
System.out.print("enter the product3 price : ");
p3.price=s.nextInt();
Product.cal(p1.price,p2.price,p3.price);
}
}