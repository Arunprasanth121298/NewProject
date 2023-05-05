package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownClass {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement crtBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	crtBtn.click();
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.id("month"));
			//driver.findElement(By.id("month"));
	Select s= new Select(month);
	List<WebElement> options = s.getOptions();
	for (int i = 0; i <options.size(); i++) {
	  WebElement webElement = options.get(i);
	  String a = webElement.getText();
	  System.out.println(a); 
		
	}
	 s.selectByIndex(0);
	  s.selectByIndex(2);
	  s.selectByIndex(3);
	  s.selectByIndex(4);
	  s.selectByIndex(5);
	  s.selectByIndex(6);
	  s.selectByIndex(7);
	  
	  List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	  for (WebElement webElement2 : allSelectedOptions) {
		  String b = webElement2.getText();
		  System.out.println(b);
		
	}
	
	}
	private void firstMethod() {
		int a = 3;
	    System.out.println(a);

	}
	private void secondMethod() {
		int b =5;
		System.out.println(b);
	
	}
	private void thirdMethod() {
		int c =6;
		System.out.println(c);
	

	}

}
