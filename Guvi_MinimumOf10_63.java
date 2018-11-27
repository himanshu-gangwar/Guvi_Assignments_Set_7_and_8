import java.io.*;
import java.util.*;

class Guvi_MinimumOf10_63
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int min,i;
		
		
		int arr[]=new int[10];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		
		
		
		min=2147483647;
		
		
		for(i=0;i<10;i++)
		{
			if(arr[i]<min)
				min=arr[i];
				
		}
		
		System.out.println("Minimum is "+min);
	}
}
