package com.maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver ds;
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/apple-iphone-13-pro-max-graphite-128-gb/p/itmbb4eb09bb8e02?pid=MOBG6VF5TBYYFCW4&lid=LSTMOBG6VF5TBYYFCW4OTE4GH&marketplace=FLIPKART&q=i+phone+13+pro+max&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=622e55e4-b46f-4698-b5db-554c0ede3798.MOBG6VF5TBYYFCW4.SEARCH&ppt=hp&ppn=homepage&ssid=a7xs0ukvmo0000001661862502630&qH=db0b1e3384f9c46c");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._3704LK"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("i phone 13 pro max");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("svg[viewBox='0 0 17 18']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._4rR01T")).click();
		Thread.sleep(2000);
		String Title = driver.getTitle();
		System.out.println(Title);
	}
}