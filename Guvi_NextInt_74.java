import java.io.*;
import java.util.Scanner;

class Guvi_NextInt_74
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
	
	double a,ni;

	System.out.println("Enter the number");
	a=sc.nextDouble();
	
	String s=Double.toString(a);
	
	int ind=s.indexOf('.');
	
	int l=s.length();
	
	if(ind+2==l)
	{
		ni=Math.ceil(a);
		System.out.println((int)(ni));
	}
	else
	{
	System.out.println("only one decimal places allowed");
	}
	
	}
}
