package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		//webdriver is a interface of selenium which contains all the browser implementation
		WebDriver driver = new ChromeDriver();
		// THi is a API commnad to maximize the browser
		driver.manage().window().maximize();
		// This command will open the URL in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String value1= driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println("The value of username is --> " + value1);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Performance")).click();
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		System.out.println("The Number of Linke are --> " + Link.size());
		for(WebElement e:Link)
		{
			String alllinks = e.getText();
			System.out.println(alllinks);
		}
		

	}

}
