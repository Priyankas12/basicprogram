package pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CountLine 
{
	public static void main(String[] args) throws Exception
	{
		File fi=new File("C:\\Users\\acer\\workspace\\priyanka\\myfile.txt");
		FileReader  fr=new FileReader(fi);
		BufferedReader b=new BufferedReader (fr);
		int L=0;
		while(b.readLine()!=null)
			{
			L++;
			}
		System.out.println("Total number of line:" +L);
		}

}
