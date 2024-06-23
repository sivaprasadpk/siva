/*
		A A A A A
		B B B B B
		C C C C C
		D D D D D
		E E E E E
*/

import java.util.*;
class Pattern6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		
		//System.out.println("Enter the value of n");
		//n=sc.nextInt();
		/*
		for(i=65;i<=69;i++)  
		{
			for(j=65;j<=69;j++) 
				System.out.print((char)i+" ");
		*/
		
		char ch;
		
		for(i='A';i<='E';i++)  
		{
			for(j=i;j<='E';j++) 
				System.out.print((char)i+" ");
				
			System.out.println(" ");
		}
	}
}