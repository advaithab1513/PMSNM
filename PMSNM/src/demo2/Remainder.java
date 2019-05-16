package demo2;

import net.bytebuddy.asm.Advice.Exit;

public class Remainder 
{

	
	public static void main(String[] args)
	{
		int x = 9;
		int remainder = x % 10;
		int quotient = x / 10;
		System.out.println(x);
		System.out.println(remainder);
		System.out.println(quotient);
	//exit(0);
	}
}
