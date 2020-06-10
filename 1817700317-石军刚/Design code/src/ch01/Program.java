package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader stdin = null;
		BufferedReader bufferReader = null;

		stdin = new InputStreamReader(System.in);
		bufferReader = new BufferedReader(stdin);

		System.out.print("请输入数字A:");
		String A = bufferReader.readLine();
		System.out.print("请选择运算符(+、-、*、/):");
		String B = bufferReader.readLine();
		System.out.print("请输入数字B:");
		String C = bufferReader.readLine();

		String D = "";
		if ("+".equals(B))
		{
			D = String.valueOf(Integer.parseInt(A) + Integer.parseInt(C));
		}
		if ("-".equals(B))
		{
			D = String.valueOf(Integer.parseInt(A) - Integer.parseInt(C));
		}
		if ("*".equals(B))
		{
			D = String.valueOf(Integer.parseInt(A) * Integer.parseInt(C));
		}
		if ("/".equals(B))
		{
			D = String.valueOf(Integer.parseInt(A) / Integer.parseInt(C));
		}

		System.out.println("结果是:" + D);
	}
}
