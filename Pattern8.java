/*
		E E E E E 
		D D D D D 
		C C C C C 
		B B B B B 
		A A A A A 
*/

import java.util.*;
class Pattern8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		char ch;
		
		for(i='E';i>='A';i--)  
		{
			for(j='E';j>='A';j--) 
				System.out.print((char)i+" ");
				
			System.out.println(" ");
		}
	}
}