package pkg2;

public class calculation2 
{
public int sub (int a, int b)
{
	return a-b;
	}
public int sum (int a, int b)
{
	return a+b;
	}
public int div (int a, int b)
{
	return a/b;
	}
public void mult (int a, int b)
{
	int c;
	c = a*b;
	System.out.println(c);
	}
 public static void main(String [] args)
 {
	 calculation2 ref = new calculation2();
	 int sub1= ref.sub(10, 2);
	 int sum1 = ref.sum(sub1,2);
	 int sum2= ref.sum(sum1,2);
	 int div1= ref. div(sum2,2);
	 ref.mult(div1,2);
 }
}
