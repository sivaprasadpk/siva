/*
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
*/

import java.util.*;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)  //for no of lines
		{
			for(j=1;j<=n;j++) //no of * per line
				System.out.print("*"+" ");
				
			System.out.println();
		}
	}
}