/*
		Z Y X W V 
		Z Y X W V
		Z Y X W V
		Z Y X W V
		Z Y X W V
*/

import java.util.*;
class Pattern10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
				
		for(i='Z';i>='V';i--)  
		{
			for(j='Z';j>='V';j--) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}