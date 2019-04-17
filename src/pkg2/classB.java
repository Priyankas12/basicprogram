package pkg2;

public class classB extends classA
{
	public classB(int a)
	{
		super(7,8,9);
		System.out.println("child 1 parameterized constructor");
	}
	public classB(int a, int b, int c)
	{
		this (6);
		System.out.println("child 3 parameterized constructor");
	}
	public classB()
	{
		this(10,11,12);
		System.out.println("child  default constructor");
		}
	public classB(int a, int b)
	{ 
		this ();
		System.out.println("child 2 parameterized construtor");
		}
	public static void main(String[] args)
	{
		classB ref = new classB(14,15);
	}
	}



