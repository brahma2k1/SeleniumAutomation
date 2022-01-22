package org.selenum2;

import org.selenium1.seleniumsecondprog;

public class seleniumthirdprog extends seleniumsecondprog {
	
		int x,y,z;
		
		public void m7(int x)
		{
			System.out.println("The value of x is:"+x);
		}
		public void m8(int x,int y)
		{
			z=x/y;
			System.out.println("The modules of z is:"+z);
		}
public static void main(String[] args) {
			
			seleniumthirdprog obj2=new seleniumthirdprog();
			obj2.m7(10);
			obj2.m8(20,20);
			obj2.m3(30,40);
	}

}
