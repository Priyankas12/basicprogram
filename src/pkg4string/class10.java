package pkg4string;

public class class10 
{
public static void main(String[] args)
{
	String s1="my name is deepak";
	int ocr=0;
	for(int i=0;i<s1.length();i++)
	{
		if (s1.charAt(i)=='e')
		ocr++;
	}
        System.out.println("occurance of letter e in this string:" +ocr);
     }
}
