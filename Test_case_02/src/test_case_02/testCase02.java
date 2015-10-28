package test_case_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testCase02 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		driver.navigate().to("http://demoqa.com/tooltip/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement mh = driver.findElement(By.xpath("//input[contains(@id, 'age')]"));
		action.moveToElement(mh).build().perform();
		action.clickAndHold(mh).perform();
		Thread.sleep(2000);
		String toolTipText = driver.findElement(By.xpath(".//*[@id='age']")).getAttribute("aria-describedby");
		System.out.println(toolTipText);
		//driver.quit();
	}

}
