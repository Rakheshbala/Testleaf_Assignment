package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alpha");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Beta");
		
		driver.findElement(By.xpath("//input[@name='reg_email__")).sendKeys("9922335588");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd_']")).sendKeys("Abcd%46#21");
		
		WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select datedd = new Select(date); 
		
		datedd.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));

		Select monthdd = new Select(month);

		monthdd.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));

		Select yeardd = new Select(year); 
		
		yeardd.selectByVisibleText("2001");

		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.close();


		Thread.sleep(5000);
		
	}
		
		

	}

