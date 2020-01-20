package com.lti;

public class Main
{
	public static void main(String[] args) 
	{
		Calcy obj=new CalcyImpl();
		int result=obj.add(100, 10011);
		System.out.println("Result: "+result);
	}

}
