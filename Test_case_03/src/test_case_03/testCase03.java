package test_case_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase03 {
	
	
		public static void main(String[] args) {
			
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/registration/");
		
		
		driver.findElement(By.id("name_3_firstname")).sendKeys("Jovan");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Markovic");
		driver.findElement(By.xpath("//input[@value='married']")).click();
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		driver.findElement(By.xpath("//input[@value='cricket ']")).click();
		
		WebElement country = driver.findElement(By.id("dropdown_7"));
		Select se = new Select(country);
		se.selectByValue("Russia");
		
		WebElement month = driver.findElement(By.id("mm_date_8"));
		Select seMonth = new Select(month);
		seMonth.selectByValue("2");
		
		WebElement day = driver.findElement(By.id("dd_date_8"));
		Select seDay = new Select(day);
		seDay.selectByValue("23");
		
		WebElement year = driver.findElement(By.id("yy_date_8"));
		Select seYear = new Select(year);
		seYear.selectByValue("1984");
		
		driver.findElement(By.id("phone_9")).sendKeys("0641234567");
		driver.findElement(By.id("username")).sendKeys("jmarkovic05");
		driver.findElement(By.id("email_1")).sendKeys("125@125.com");
		
		WebElement upload = driver.findElement(By.id("profile_pic_10"));
		upload.sendKeys("C:\\Users\\jovanm\\Desktop\\452276.jpg");
		
		driver.findElement(By.id("description")).sendKeys("I am not a bot and this is not automated!");
		driver.findElement(By.id("password_2")).sendKeys("Neskafa89");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("Neskafa89");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		
		
		}
		
	

}
