package TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestCases.listenersinterface.class)

public class listenertest {
	@Test
	void test1()
	{
		System.out.println("This is test1");
		Assert.assertEquals("A", "A");
		System.out.println("Test passed");
		
	}
	@Test
	void test2()
	{
		System.out.println("This is test2");
		Assert.assertEquals("B", "B");
		System.out.println("Test passed");
		
	}
	@Test
	void test3()
	{
		System.out.println("This is test3");
		Assert.assertEquals("C", "C");
		System.out.println("Test passed");
		
	}
	@Test
	void test4()
	{
		System.out.println("This is test4");
		Assert.assertEquals("D", "D");
		System.out.println("Test passed");
		
	}
	@Test
	void test5()
	{
		System.out.println("This is test5");
		Assert.assertEquals("E", "E");
		System.out.println("Test passed");
		
	}
	@Test
	void test6()
	{
		System.out.println("This is test6");
		Assert.assertEquals("F", "F");
		System.out.println("Test passed");
		
	}

	@Test
	void test7()
	{
		System.out.println("This is test7");
		Assert.assertEquals("G", "G");
		System.out.println("Test passed");
		
	}

	@Test
	void test8()
	{
		System.out.println("This is test8");
		Assert.assertEquals("H", "H");
		System.out.println("Test passed");
		
	}

	@Test()
	void test9()
	{
		System.out.println("This is test9");
		Assert.assertEquals("I", "J");
	
		System.out.println("Test Failed");
	}
	@Test
	void test10()
	{
		System.out.println("This is test10");
	throw new SkipException("This is skip exception");	
	
	}

}
