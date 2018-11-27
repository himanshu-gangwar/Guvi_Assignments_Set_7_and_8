import java.io.*;
import java.util.Scanner;

class Guvi_Factors_77
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
		
	int a,i;

	System.out.println("Enter the number");
	a=sc.nextInt();
	
	
	for(i=1;i<=a;i++)
	{
		if(a%i==0)
			System.out.print(i+" ");	
	}
	System.out.println();
	
    }
}
