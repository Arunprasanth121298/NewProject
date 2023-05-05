package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JseClass {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	//WebElement txtBox = driver.findElement(By.id("email"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	/*js.executeScript("arguments[0].setAttribute('value','greens@gmail.com')", txtBox);
	WebElement txtPass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','greens@123')", txtPass);
	WebElement lgnBtn = driver.findElement(By.name("login"));
    js.executeScript("arguments[0].click()", lgnBtn);
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtBox);
	String a = (String)executeScript;
	System.out.println(a);*/
	WebElement ScrlDown = driver.findElement(By.xpath("//h2[contains (text(),'Job')]"));
	js.executeScript("arguments[0].scrollIntoView(true)", ScrlDown);
	WebElement scrlUp = driver.findElement(By.xpath("//a[text()='Contact Us']"));
	js.executeScript("arguments[0].scrollIntoView(false)", scrlUp);
	
	
	
	}

}
