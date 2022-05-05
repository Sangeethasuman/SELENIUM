package learnwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//http://www.leafground.com/pages/Calendar.html
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Client\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		WebElement calendar=driver.findElement(By.id("datepicker"));
	   // calendar.sendKeys("10/12/2022"+Keys.ENTER);	
		calendar.click();
		WebElement nextbutton=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]"));
		nextbutton.click();
		WebElement selectbutton=driver.findElement(By.className("ui-state-default"));
		selectbutton.click();
		
		
		
	}

}
