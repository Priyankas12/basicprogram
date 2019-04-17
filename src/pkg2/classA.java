package pkg2;

public class classA 
{
public classA(int a, int b)
{
	System.out.println("parent 2 parameterized constructor");
}
public classA()
{
	this (11,13);
	System.out.println("parent default constructor");
}
public classA(int a)
{
	this ();
	System.out.println("parent 1 parameterized constructor");
}
public classA(int a, int b, int c)
{
	this(1);
	System.out.println("parent 3 parameterized constructor");
}
}

