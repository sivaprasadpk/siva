/*
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
*/

import java.util.*;
class Pattern5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		for(i=n;i>=1;i--)  //for no of lines
		{
			for(j=n;j>=1;j--) //no of * per line
				System.out.print(j+" ");
				
			System.out.println(" ");
		}
	}
}