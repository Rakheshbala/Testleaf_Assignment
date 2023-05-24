package selenium.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebDriver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver openn=new ChromeDriver();
		openn.get("http://leaftaps.com/opentaps/control/login");
		openn.manage().window().maximize();
		Thread.sleep(2000);
		openn.close();
	}

}
