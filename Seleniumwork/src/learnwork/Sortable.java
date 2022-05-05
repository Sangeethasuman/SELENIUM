package learnwork;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		java.util.List<WebElement> sortable =driver.findElements(By.xpath("//*[@id='sortable']/li"));
	     WebElement fromelement=sortable.get(6);
	     WebElement toelement=sortable.get(0);
	     Actions action=new Actions(driver);
	     action.clickAndHold(fromelement);
	     action.moveToElement(toelement);
	     action.release(toelement);
	     action.build().perform();
	     WebElement fromelement1=sortable.get(5);
	     WebElement toelement1=sortable.get(1);
	     Actions action1=new Actions(driver);
	     action1.clickAndHold(fromelement1);
	     action1.moveToElement(toelement1);
	     action1.release(toelement1);
	     action1.build().perform();
	     
	
	
	}

}
