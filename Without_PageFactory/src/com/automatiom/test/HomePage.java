package com.automatiom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//*******Without Using Page Factory**********
	
	WebDriver driver;
	
	By SeartchBox = By.name("searchVal");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void serch_text() {
		driver.findElement(SeartchBox).sendKeys("Shoes");
		driver.findElement(SeartchBox).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(SeartchBox).sendKeys(Keys.RETURN);
	}
	
	
	//*******With Using Page Factory********
	
//	@FindBy(name ="searchVal")
//	public WebElement SeartchBox;
//	
//	public HomePage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void serch_text() {
//		SeartchBox.sendKeys("Shoes");
	   
//	}

}
