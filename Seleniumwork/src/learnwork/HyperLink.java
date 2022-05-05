package learnwork;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		WebElement homepage=driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		WebElement wheretogo=driver.findElement(By.partialLinkText("supposed to go without clicking me?"));
		String secondlink=wheretogo.getAttribute("href");
		System.out.println(secondlink);
		
		WebElement brokenlink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{System.out.println("link is broken");
		
		}
		else
		{
			System.out.println("link is not broken");
		}
		
		driver.navigate().back();
		WebElement homepage1=driver.findElement(By.linkText("Go to Home Page"));
		homepage1.click();
		
		driver.navigate().back();
		
		java.util.List <WebElement> totallink=driver.findElements(By.tagName("a"));
		int count=totallink.size();
		System.out.println(count);
		
		
	}

}
