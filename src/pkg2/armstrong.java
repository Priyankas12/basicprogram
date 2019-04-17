package pkg2;

import java.util.Scanner;

public class armstrong
{
	public static void main(String[] args)
	{
		int a, mul=0,s;
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		s= num;
		while(num>0)
		{
			a=num%10;
			mul=(mul)+(a*a*a);
			num=num/10;
		}
		if(s==mul)
		{
			System.out.println("number is armstrong:");
		}
		else
		
			System.out.println("number is not armstrong:");
	}
			
	}

	
	

