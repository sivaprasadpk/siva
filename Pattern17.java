/*
		E 
		D D 
		C C C 
		B B B B 
		A A A A A 
*/

import java.util.*;
class Pattern17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='E';i>='A';i--) 
		{
			for(j='E';j>=i;j--) 
				System.out.print(i+" ");
				
			System.out.println(" ");
		}
	}
}