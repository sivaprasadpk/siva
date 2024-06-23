/*
		E D C B A
		E D C B A 
		E D C B A
		E D C B A
		E D C B A
*/

import java.util.*;
class Pattern9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='E';i>='A';i--)  
		{
			for(j='E';j>='A';j--) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}