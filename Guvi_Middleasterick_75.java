import java.io.*;

class Guvi_Middleasterick_75
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
	
	StringBuilder sbo = new StringBuilder(str);
		
	int l;
	
	l=str.length();

	
	if(l%2==0)
	{
		
		sbo.setCharAt(l/2-1,'*');
		sbo.setCharAt(l/2,'*');
	
	}	

	else	
		sbo.setCharAt(l/2,'*');
		
	System.out.println(sbo);

    } 
} 
