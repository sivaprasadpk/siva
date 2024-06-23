/*
		E D C B A 
		D C B A 
		C B A 
		B A 
		A 
*/

import java.util.*;
class Pattern20
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='E';i>='A';i--) 
		{
			for(j=i;j>='A';j--) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}