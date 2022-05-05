package learnwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://www.leafground.com/pages/Link.html");

//WebElement link=driver.findElement(By.linkText("Go to Home Page"));
//link.click();

WebElement partiallink=driver.findElement(By.partialLinkText("Home Page"));
partiallink.click();
	}

}
