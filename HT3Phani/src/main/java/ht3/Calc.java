package ht3;

public class Calc{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;

	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public int pow(int a,int b)
	{
		int p = 1;
		for(int i=1;i<=b;i++)
		{
			p*=a;
		}
		return p;
	}
}

