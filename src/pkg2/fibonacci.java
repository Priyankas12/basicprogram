package pkg2;

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		int t1=0, t2=1, sum;
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<=n; i++)
		{
			System.out.println(t1+ "+");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}
	}