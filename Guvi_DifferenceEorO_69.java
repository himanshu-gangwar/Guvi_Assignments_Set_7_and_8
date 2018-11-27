import java.io.*;

class Guvi_DifferenceEorO_69
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no1,no2;

		System.out.println("Enter the first number");
		no1=Integer.parseInt(in.readLine());
				
		System.out.println("Enter the second number");
		no2=Integer.parseInt(in.readLine());
	
	
			
		if((no1-no2)%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
