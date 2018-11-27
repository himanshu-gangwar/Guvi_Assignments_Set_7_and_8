import java.io.*;

class Guvi_FirstKChars_61
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
	
	int i,n;
	char ch;
	
	System.out.println("How many characters you want to print");
	n=Integer.parseInt(in.readLine());	
	
		
	for(i=0;i<n;i++)
	{
		ch=str.charAt(i);
	
		System.out.print(ch);		
			
		
	}

	System.out.println();		
    } 
} 
