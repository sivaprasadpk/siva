/*
		E D C B A 
		E D C B
		E D C 
		E D 
		E
*/

import java.util.*;
class Pattern19
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='A';i<='E';i++) 
		{
			for(j='E';j>=i;j--) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}