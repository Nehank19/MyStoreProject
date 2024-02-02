package com.selenium.application;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstclass {

public static WebDriver driver;
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();


		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.findElement(By.id("APjFqb")).sendKeys("selenium tutorial",Keys.ENTER);
		driver.findElement(By.className("VuuXrf")).click();
		
		driver.close();
	}

}
