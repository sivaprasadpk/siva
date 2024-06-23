/*
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 
*/

import java.util.*;
class Pattern16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='A';i<='E';i++) 
		{
			for(j='A';j<=i;j++) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}