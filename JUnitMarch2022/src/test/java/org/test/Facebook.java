package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
		driver.quit();
	}
	
	@Before
	public void before() {
		System.out.println("Before");
		Date d = new Date();
		System.out.println("Test starts----"+d);
	}
	
	@After
	public void after() {
		System.out.println("After");
		Date d = new Date();
		System.out.println("Date Ends-----"+d);
	}
	
	@Ignore
	@Test
	public void test1() { 
	    System.out.println("test1");
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("renu");
	    driver.findElement(By.id("pass")).sendKeys("1234");
	    driver.findElement(By.name("login")).click();
	}
	
	@Ignore    //ignoring particular test case
	@Test
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void test2() {
		System.out.println("test2");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("renu");
		driver.findElement(By.name("lastname")).sendKeys("koneru");
		driver.findElement(By.name("websubmit")).click();
		
		System.out.println("test2");
		
	}
}
