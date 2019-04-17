package pkg4string;

public class class11 
{
	public static void main(String[] args)
	{
		String s1="madam";
		int A=0;
		int B=s1.length()-1;
		for(int i=0;i<s1.length(); i++)
		{
			if(s1.charAt(i)==s1.charAt(B--))
				A++;
		}
		if(A==s1.length())
			{
				System.out.println("String is palindrom");
			}
		else
		{
			System.out.println("String is not palindrom");
			}
		}
		
	}

