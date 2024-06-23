/*
		A 
		B A 
		C B A 
		D C B A 
		E D C B A 
*/

import java.util.*;
class Pattern21
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='A';i<='E';i++) 
		{
			for(j=i;j>='A';j--) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}