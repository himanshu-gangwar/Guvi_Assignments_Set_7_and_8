import java.io.*;

class Guvi_CheckBinary_62
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
		
	int i,l,f=0;
	char ch;
	
	l=str.length();

	
	for(i=0;i<l;i++)
	{
		ch=str.charAt(i);
	
		if(ch!='1' && ch!='0')
			f=1;		
			
		
	}

	if(f==0)
		System.out.println("Yes");
	else
		System.out.println("No");

    } 
} 
