package org.test;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
			}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
		
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void test1() {
	    System.out.println("test1");
	}
	
	@Ignore    //ignoring particular test case
	@Test
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
