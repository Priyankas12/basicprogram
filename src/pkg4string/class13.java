package pkg4string;

import java.util.Scanner;

public class class13 {

	public static void main(String[] args)
	{
	System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[] s2 =s1.split(" ");
		int L=s1.length();
		for(int i=0;i<L;i++)
		{
			System.out.println(s1.charAt(i));
		}
	}
}
		




