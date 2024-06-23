/*
		E
		D E
		C D E
		B C D E
		A B C D E
*/

import java.util.*;
class Pattern24
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='E';i>='A';i--) 
		{
			for(j=i;j<='E';j++) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}