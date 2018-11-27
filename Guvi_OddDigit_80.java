import java.io.*;

class Guvi_OddDigit_80
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no,r,l,c=0;

		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
		
		String str=Integer.toString(no);
		l=str.length();
		
		int arr[]=new int[l];
		
		while(no!=0)
		{
			r=no%10;
			if(r%2!=0)
				arr[c++]=r;
			no=no/10;
		}
		
		if(c==0)
			System.out.println("No odd digits");
		else
		{
			for(int i=c-1;i>=0;i--)
				System.out.print(arr[i]+" ");
		
		}
		
		
		System.out.println();

	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
