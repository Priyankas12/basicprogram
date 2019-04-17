package pkg2;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int b= sc.nextInt();
		a=b%2;
		if(a==1)
		{
			System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}
		
	}

}
