/*
		1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5
*/

import java.util.*;
class Pattern12
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
				System.out.print(i+" ");
				
			System.out.println(" ");
		}
	}
}