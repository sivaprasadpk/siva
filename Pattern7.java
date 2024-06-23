/*
		A B C D E
		A B C D E
		A B C D E
		A B C D E
		A B C D E
*/

import java.util.*;
class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		char ch;
		
		for(i='A';i<='E';i++)  
		{
			for(j='A';j<='E';j++) 
				System.out.print((char)j+" ");
				
			System.out.println(" ");
		}
	}
}