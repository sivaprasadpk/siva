/*
		A B C D E
		B C D E
		C D E
		D E
		E
*/

import java.util.*;
class Pattern23
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='A';i<='E';i++) 
		{
			for(j=i;j<='E';j++) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}