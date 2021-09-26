package com.ultimateqa.selenium.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTest {	
	@Test
	public void googleTest() {
//		Tell system where to find chromedriver. On Windows add .exe suffix
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		Go to a URL
		driver.get("https://www.saucedemo.com/");
//		kill the browser
//		driver.quit();
	}
//	public static WebDriver driver=null;
//	public static void main(String args[]) {
//	System.setProperty("webdriver.chrome.driver",
//	"C:\\selenium\\chromedriver_win32\\chromedriver.exe"); driver=new
//	ChromeDriver(); driver.navigate().to("https://www.google.com"); }
	 
}
