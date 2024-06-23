/*
		E 
		E D 
		E D C 
		E D C B 
		E D C B A 
*/

import java.util.*;
class Pattern18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='E';i>='A';i--) 
		{
			for(j='E';j>=i;j--) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}