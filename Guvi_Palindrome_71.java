import java.io.*;

class Guvi_Palindrome_71
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str,str1,rstr;

	System.out.println("Enter the string");
	str=in.readLine();
	
	StringBuffer so=new StringBuffer(str);
	
	so.reverse();
	
	if((so.toString()).equals(str))
		System.out.println("Yes");
	else
		System.out.println("No");			
		
    } 
} 
