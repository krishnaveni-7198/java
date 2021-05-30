import java.util.*;

class Issymmetric 
{
public static void main(String args[]) 
{
Scanner s=new Scanner(System.in);
int r,c;
System.out.print("enter number of rows in the matrix : ");
r=s.nextInt();
System.out.print("enter number of columns in the matrix : ");
c=s.nextInt();
int x[][]=new int[r][c];
int y[][]=new int[r][c];
System.out.println("enter the elements of the matrix : ");
for(int i=0;i<r;i++) 
{
for(int j=0;j<c;j++)
{
x[i][j]=s.nextInt();
}
}
if(r==c) 
{  
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			y[i][j]=x[j][i];
		}
	}
}
System.out.println("Given matrix is:");
for(int i=0;i<r;i++) 
{
	for(int j=0;j<c;j++) 
	{
		System.out.print(" "+x[i][j]);
	}
	System.out.println();	
}
System.out.println("Transpose matrix is:");
for(int i=0;i<r;i++) 
{
	for(int j=0;j<c;j++) 
	{
		System.out.print(" "+y[i][j]);
	}
	System.out.println();	
}
int count=0;
for(int i=0;i<r;i++) 
{
	for(int j=0;j<c;j++) 
	{
		if(x[i][j]==y[i][j])
		{
			count++;
		}
	}
}
if(count==(r*c))
{
System.out.println("yes,the given matrix is symmetric !");
}
else
{
System.out.println("No,the given matrix is assymetric !");
}
}
}