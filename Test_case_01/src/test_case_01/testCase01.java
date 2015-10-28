package test_case_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase01 {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement tab4 = driver.findElement(By.id("ui-id-4"));
		tab4.click();
		
		WebElement tabTextBox = driver.findElement(By.id("tabs-4"));
		
		if (tab4.getText().contains("Tab 4"))
		System.out.println("Yes, tab title is Tab 4");
		else 
		System.out.println("No, tab title is not Tab 4");	
		
		if (tabTextBox.getText().contains("Content 4 Title"))
		System.out.println("Yes");
		else 
		System.out.println("No");
		
		
	}

}
