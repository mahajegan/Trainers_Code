package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class casestudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		//webdriver is a interface of selenium which contains all the browser implementation
		WebDriver driver = new ChromeDriver();
		// THi is a API commnad to maximize the browser
		driver.manage().window().maximize();
		// This command will open the URL in the browser
		driver.get("http://newtours.demoaut.com/");
		// i am trying to get the title of under construction and store in a variable
		String underconstitle= "Under Construction: Mercury Tours";
		//i am trying to click on all the links 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// i am storing the size of links in linktext
		String[] linktext = new String[links.size()];
		int i=0;
		//Extract the links text of each link element
		for(WebElement e:links)
		{
			linktext[i]=e.getText();
			i++;
		}
		//Test weather each link is working or not working
		for(String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underconstitle))
			{
				System.out.println("\"" + t + "\" + is underconstruction");
			}
			else
			{
				System.out.println("\"" + t + "\" + is Working");
			}
			driver.navigate().back();
		}
		//to close the active browser/current browser
		//common between these two
		//There is no return type between driver.close and driver.quite
		//it will not accept any arguments
		driver.close();
		//Close all the browser which are opened through the selenium instance
		driver.quit();
	}

}
