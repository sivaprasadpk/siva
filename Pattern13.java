/*
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
*/

import java.util.*;
class Pattern13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)  
		{
			for(j=1;j<=i;j++) 
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}