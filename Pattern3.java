/*
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
*/

import java.util.*;
class Pattern3
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
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}