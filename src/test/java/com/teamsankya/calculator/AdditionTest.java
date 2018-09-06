package com.teamsankya.calculator;

import junit.framework.TestCase;

public class AdditionTest {
	@org.junit.Test
public void Test() 
{
	int sum=Addition.Add(10,20);
	TestCase.assertEquals(30, sum);
	}
}
