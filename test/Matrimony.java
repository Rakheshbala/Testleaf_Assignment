package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.tamilmatrimony.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		WebElement profile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select profiledd = new Select(profile);
		profiledd.selectByVisibleText("Myself");

		driver.findElement(By.id("NAME")).sendKeys("Rakhesh");

		driver.findElement(By.id("gendermale")).click();
	
		
		WebElement date = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select date1 = new Select(date);
		date1.selectByVisibleText("20");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("july");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2000");
	
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select regligiondd = new Select(religion);
		regligiondd.selectByVisibleText("Hindu");
		
		WebElement tongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select tonguedd = new Select(tongue);
		tonguedd.selectByVisibleText("Tamil");
	
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select countrydd = new Select(country);
		countrydd.selectByVisibleText("India");
	
		WebElement countrycode = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select countrycodedd = new Select(countrycode);
		countrycodedd.selectByVisibleText("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("99663322558");
		
		driver.findElement(By.id("EMAIL")).sendKeys("neymar10@gmail.comrakheshbala232@gmail.com");
		driver.close();

	}

}
