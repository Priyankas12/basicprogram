package pkg2;

import java.util.Scanner;

public class factorial
{
	public static void main(String[] args) {
		int fact=1,i;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(i=1; i<=n; i++)
		{
			fact=(fact*i);
		}
		System.out.println(fact);
		}
		
		
	}

