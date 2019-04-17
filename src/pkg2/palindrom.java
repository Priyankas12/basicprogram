package pkg2;

import java.util.Scanner;

public class palindrom 
{
public static void main(String[] args) 
{
	int a, rev=0, n;
	System.out.println( "enter a number");
	Scanner sc= new Scanner(System.in);
	int s = sc.nextInt();
	n = s;
	while (s>0)
	{
		a=s%10;
		rev=(rev*10)+a;
		s=s/10;
		}
	if(n==rev)  
	{
     System.out.println("number is palindrom");
	}
	 else
	 {
		System.out.println("number is not palindrom");
	}
}
}

