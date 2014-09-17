package com.mpa.selenium.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserSeleniumTest {

	protected WebDriver driver;
	protected String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:9090/mpa-demo/";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void verifyTasksTab() throws IOException, InterruptedException {

		WebElement element = driver.findElement(By.id("user"));
		driver.findElement(By.id("name")).sendKeys("mpatestname");
		driver.findElement(By.id("password")).sendKeys("mpa@13ersf%");
		driver.findElement(By.id("gender1")).sendKeys("Male");
		driver.findElement(By.id("community1")).click();
		driver.findElement(By.id("community2")).click();
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
