import java.io.*;
import java.util.Scanner;

class Guvi_NearestPower2_70
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
		
	int a;
	
	double lb2,temp;

	System.out.println("Enter the number");
	a=sc.nextInt();
	
	a++;
	
	lb2=Math.log(a)/Math.log(2);
	temp=Math.ceil(lb2);

	while(lb2!=temp)
	{
		a++;
		lb2=Math.log(a)/Math.log(2);
		temp=Math.ceil(lb2);	
	}
	
	
	System.out.println(a);

	}
}
