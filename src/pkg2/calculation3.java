package pkg2;

public class calculation3 
{
	public int sum (int a, int b)
	{
		return a+b;
	}
 public int sub (int a, int b)
 {
	 return a-b;
 }
 public int mult (int a, int b)
 {
	 return a*b;
 }
 public void div (int a, int b)
 {
	 int c;
	 c=a/b;
	 System.out.println(c);
	 }
 public static void main(String []args)
 {
	 calculation3 refr = new calculation3();
	 int sum1 = refr.sum(10, 2);
	 int sub1 = refr.sub(sum1,2);
	 int sum2 = refr.sum(sub1,2);
	 int mult1 = refr.mult(sum2,2);
	  refr.div(mult1, 2);
 }
	  }

