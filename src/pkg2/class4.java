package pkg2;

public class class4 
{
	public class4()
	{
		this(1,2,3); 
		System.out.println("default constructor");
	}
        public class4 (int a)
        {
        	this(); 
        	System.out.println("one parameterized");
        }
        public class4(int a, int b)
        {
        	this(1);
        	System.out.println("two parameterized");
        }
         public class4(int a, int b, int c)
         {
  
          System.out.println("three parameterized");
        }
         public static void main(String[] args)
         {
         class4 ref = new class4(4,2);
			}
        } 

