package test;


		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class UiBank {
			
			public static void main(String[] args) throws InterruptedException {
			
				ChromeDriver driver = new ChromeDriver();
			
				driver.get("https://uibank.uipath.com/register-account");
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
				driver.manage().window().maximize();
			
				driver.findElement(By.id("firstName")).sendKeys("Rakhesh");
			
				WebElement title = driver.findElement(By.id("title"));
				Select titledd = new Select(title);
				titledd.selectByVisibleText("Mr");
			
				driver.findElement(By.name("middleName")).sendKeys("Bala");
			
				driver.findElement(By.id("lastName")).sendKeys("A");
			
				WebElement gender = driver.findElement(By.id("sex"));
				Select genderdd = new Select(gender);
				genderdd.selectByVisibleText("Male");
			
				WebElement employment = driver.findElement(By.id("employmentStatus"));
				Select employmentdd = new Select(employment);
				employmentdd.selectByVisibleText("Full-time");
			
				driver.findElement(By.id("username")).sendKeys("Bala");
			
				driver.findElement(By.id("email")).sendKeys("Rakhjehg@gmail.com");
			
				driver.findElement(By.id("password")).sendKeys("ABsd5689@");
			
				driver.close();

			}

		}

	


