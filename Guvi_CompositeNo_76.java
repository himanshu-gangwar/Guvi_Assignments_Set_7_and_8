import java.io.*;
import java.math.*;
import java.util.Scanner;

class Guvi_CompositeNo_76
{
    public static void main(String args[])
    { 

	Scanner sc=new Scanner(System.in);
	
	try
	{
		BigInteger pw,fer,base,temp,noB;
		
		int no;
		
		base=BigInteger.valueOf(2); 
	
		System.out.println("Enter the number");
		no=sc.nextInt();
		
		noB=BigInteger.valueOf(no);
		pw=base.pow(no);
		fer=pw.subtract(base);
		
		temp=fer.mod(noB);
        	
        	if(temp.compareTo(BigInteger.valueOf(0))!= 0)
            		System.out.println("Composite no. ");
       		else
            		System.out.println("Not a compsite no. ");
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
}




