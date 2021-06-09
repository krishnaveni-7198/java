/*7.	Create CPU with attribute price. 
Create inner class Processor (no. of cores, manufacturer) and static nested class RAM (memory, manufacturer). 
Create an object of CPU and print information of Processor and RAM.*/


import java.util.*;

class CPU 
{
int price;

class Processor
{
int cores;
String manufacturer;

int getCache()
{
 return 9 ;
}
}

protected class RAM
{
int memory;
String manufacturer;      

int getType()
{
return 4;
}
}
}

public class PC 
{
public static void main(String args[]) 
{
CPU c = new CPU();
CPU.Processor p = c.new Processor();
CPU.RAM r = c.new RAM();
System.out.println("processor cache : " + p.getCache() + "MB");
System.out.println("ram memory type : " + r.getType() + "GB DDR4");
}
}