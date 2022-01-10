package org.selenium1;

public class seleniumfirstprog {
	
	int x,y,z;
	
	public void m1(int x)
	{
		System.out.println("The value of x is:"+x);
	}
	public void m2(int x,int y)
	{
		z=x*y;
		System.out.println("The multiplication of z is:"+z);
	}
	public static void main(String[] args) {
		
		seleniumfirstprog obj=new seleniumfirstprog();
		obj.m1(10);
		obj.m2(10,20);

	}

}
