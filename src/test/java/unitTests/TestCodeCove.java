package unitTests;

import org.testng.annotations.Test;

import compare.CompareString;

public class TestCodeCove {
	
	@Test
	public void positiveTestCase()
	{
		CompareString obj = new CompareString();
		obj.containsOrNot("Selenium is a test Automation Tool");
	}
	
	@Test
	public void negativeTestCase()
	{
		CompareString obj = new CompareString();
		obj.containsOrNot("Jenkins is a CI tool");
	}

}
