package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		//webdriver is a interface of selenium which contains all the browser implementation
		WebDriver driver = new ChromeDriver();
		// THi is a API commnad to maximize the browser
		driver.manage().window().maximize();
		// This command will open the URL in the browser
		//navigation methods
		//1st navigation method
		driver.navigate().to("http://newtours.demoaut.com/");
		//To click on Home link
		driver.findElement(By.linkText("Cruises")).click();
		Thread.sleep(3000);
		//2nd navigation method
		driver.navigate().back();
		Thread.sleep(3000);
		//3rd navigation method
		driver.navigate().forward();
		Thread.sleep(3000);
		//4th navigation method
		driver.navigate().refresh();
		driver.close();

	}

}
