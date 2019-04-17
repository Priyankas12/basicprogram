package pkg2;

import java.util.Scanner;

public class table
{
	public static void main(String[] args)
	{
	System.out.println("enter the number");
	Scanner sc = new Scanner( System.in);
	int t= sc.nextInt();
	
	int num;
	for (int i=1; i<=10; i++)
	{
		num = i*t;
		System.out.println(i+"*" +t+ "="+num);
	}
	}

}
