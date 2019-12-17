package org.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
static WebDriver driver;
	public static void launchchrome(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ha\\eclipse-workspace\\Pom\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	public static void fill(WebElement e,String value) {
		e.sendKeys(value);
		
	}
	public static void btnClick(WebElement e) {
		e.click();
		
	}
	
	
	

}

