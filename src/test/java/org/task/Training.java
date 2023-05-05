package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("__remote_allows_orgins=*");
	WebDriver driver = new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
}