package pkg2;

import java.util.Scanner;

public class swapping1 
{
public static void main(String[] args) 
{
	int a, b;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of a");
	a=sc.nextInt();
	System.out.println("enter of a:" +a);
	System.out.println("enter of value b");
	b=sc.nextInt();
	System.out.println("enter of b:" +b);
	System.out.println("swapping "+"a=" +a + "and" + "b=" +b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swapping "+"a=" +a + "and" + "b=" +b);
	}
}
