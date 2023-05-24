package selenium.day2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.security.util.Password;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		
	//maximize window
		driver.manage().window().maximize();	
		
	// url
		driver.get("http://leaftaps.com/opentaps/control/login");
	
	//track username
		WebElement username=driver.findElement(By.id("username"));
	//passing the values
		username.sendKeys("DemoSalesManager");
	
	//track password
		WebElement password=driver.findElement(By.id("password"));
	//passing the values
		password.sendKeys("crmsfa");
		
	//click the loginButton
		WebElement loginButton=driver.findElement(By.className("decorativeSubmit"));	
		loginButton.click();
	
	//click the link to login
		WebElement clickTheButton=driver.findElement(By.linkText("CRM/SFA"));
		clickTheButton.click();
	
	//click the LeadButton
		WebElement clickLead=driver.findElement(By.linkText("Leads"));
		clickLead.click();
	
	//Create lead
		WebElement createLead=driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
	//locate companyName
		WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("OAA");
		
	//locate First Name
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("OnRoad Ambulance");
		
	//locate last Name
		WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Assistance");
	
	//locate first name (local)
		WebElement firstLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstLocal.sendKeys("LIFI");
		
	//locate Department
		WebElement department=driver.findElement(By.name("departmentName"));
		department.sendKeys("Computer Science Engineering");
		
	//locate description
		WebElement description=driver.findElement(By.name("description"));
		description.sendKeys("Avoid congested Traffic Hot Spot");
		
	//Email address
		WebElement emailAddress=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("rakheshbala3@gmail.com");
	//timimg to preview
		Thread.sleep(3000);
		
	//click create
		WebElement create=driver.findElement(By.linkText("Create Lead"));
		create.click();
		Thread.sleep(5000);
	
	//close the browser
		driver.close();
	
	
	}

}
