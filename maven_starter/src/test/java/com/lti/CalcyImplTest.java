package com.lti;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcyImplTest 
{

	@Test
	public void testAddAddForSuccess() 
	{
		CalcyImpl target = new CalcyImpl();
		int result=target.add(100, 101);
		assertEquals(201,result);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddAddForException() 
	{
		CalcyImpl target = new CalcyImpl();
		target.add(-100, -1);
	}

}
