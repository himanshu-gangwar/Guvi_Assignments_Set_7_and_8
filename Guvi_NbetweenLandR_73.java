import java.io.*;

class Guvi_NbetweenLandR_73
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	int no,l,r;
	
	System.out.println("Enter the number");
	no=Integer.parseInt(in.readLine());
	
	
	System.out.println("Enter the lower limit");
	l=Integer.parseInt(in.readLine());
	
	System.out.println("Enter the upper limit");
	r=Integer.parseInt(in.readLine());
	
		
	if(no>l&&no<r)
		System.out.println("Yes");
					
	else
		System.out.println("No");
    } 
} 
