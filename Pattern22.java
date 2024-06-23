/*
		A B C D E
		A B C D
		A B C
		A B
		A
*/

import java.util.*;
class Pattern22
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		
		for(i='E';i>='A';i--) 
		{
			for(j='A';j<=i;j++) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}