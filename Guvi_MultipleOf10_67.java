import java.io.*;

class Guvi_MultipleOf10_67
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no;
	
		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
		
		while(no%10!=0)
			no++;	
		
		System.out.println(no);
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
