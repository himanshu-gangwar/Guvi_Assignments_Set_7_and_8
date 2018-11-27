import java.io.*;

class Guvi_Productperfectsquare_79
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
	
		double p=Math.sqrt(no1*no2);
		
		double temp=Math.ceil(p);
			
		if(temp==p)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
