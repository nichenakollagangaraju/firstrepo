package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sampletest
{
	@Test
	public void test()
	{
		String exptitle="Googl";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Sleeper.sleepTightInSeconds(4);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		Assert.assertEquals(title, exptitle);
		System.out.println(title);
	}

}
