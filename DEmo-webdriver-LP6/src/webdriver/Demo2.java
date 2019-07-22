package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		//i want to store an element in a variable 
		WebElement username = driver.findElement(By.name("userName"));
		if(username.isEnabled())
		{
			//sending the value to username
			username.sendKeys("sunil");
			username.clear();
			username.sendKeys("sunil");
		}
		if(username.isDisplayed())
		{
			//Getattritube when ever we pass value to the edit field
			String UN = username.getAttribute("value");
			String UN1= username.getAttribute("name");
			System.out.println(UN1);
			// gettext --> label, dropdown, links
			//Getattribute --> Edit box where we pass value and if any element attribute is dynamic in nature
			String text =driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
			System.out.println(text);
			System.out.println(UN);
			
		}
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		if(driver.findElement(By.xpath("//*[@name='tripType'and @value='roundtrip']")).isSelected())
		{
			//work with radio button
			driver.findElement(By.xpath("//*[@name='tripType'and @value='oneway']")).click();
		}
		//i am stroing an element which is drop down in a variable
		WebElement DD = driver.findElement(By.name("passCount"));
		//Select is going to click on the drop down
		Select sel = new Select(DD);
		//get all the values from the drop down
		List<WebElement> options = sel.getOptions();		
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		//Select the value from the dropdown
		sel.selectByValue("2");
		
		//direct by using id
		String option1 = driver.findElement(By.name("passCount")).getAttribute("value");
		System.out.println(option1);
		Thread.sleep(3000);
		sel.selectByVisibleText("1");
		//getfirstselectedoption
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getAttribute("value"));
		Thread.sleep(3000);
		sel.selectByIndex(0);
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("sunil");
		driver.findElement(By.name("passLast0")).sendKeys("Nagaraj");
		driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234");
		//This is to find both the elements using FindElements
		List<WebElement>checkbox = driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
		System.out.println("Checkbox size is-->" + checkbox.size());
		//i value 0 it has to select both the checkboxes
		for(int i=0;i<1;i++)
		{
			checkbox.get(i).click();
		}
		driver.findElement(By.name("buyFlights")).click();
		
		//This for loop to click on both the checkboxea
		/*for(WebElement e:checkbox)
		{
			e.click();
		}*/

	}

}
