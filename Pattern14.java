/*
		1 1 1 1 1
		2 2 2 2 2
		3 3 3 3 3
		4 4 4 4 4
		5 5 5 5 5



i=n;i>=1;i--
j=n;j>=i;j--
		
*/

import java.util.*;
class Pattern2
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
				System.out.print(i+" ");
				
			System.out.println(" ");
		}
	}
}