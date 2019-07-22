package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// This is to set the property of my gecko driver the reason is 3.0 version supports the latest version of firefox so we require gecko driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		//webdriver is a interface of selenium which contains all the browser implementation
		WebDriver driver = new ChromeDriver();
		// THi is a API commnad to maximize the browser
		driver.manage().window().maximize();
		// This command will open the URL in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String ExpectedTitle = "OrangeHRM";
		// This is to find the Element and pass value to the element
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		// This is used fetch the title of the page
		String ActualTitle= driver.getTitle();
		System.out.println(ActualTitle);
		if(ExpectedTitle.equals(ActualTitle))
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			// This will close the opened instance of the browser but it will close only one browser
			driver.close();
			//IF you want to close mulitple browser opeened through instance 
			//driver.quit();
		}
		else
		{
			System.out.println("Title is not same");
			driver.close();
		}
		
		
	}

}
