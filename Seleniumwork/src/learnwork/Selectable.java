package learnwork;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		java.util.List<WebElement> selectables=driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int listsize=selectables.size();
		System.out.println(listsize);
		Actions action=new Actions(driver);
		action.clickAndHold(selectables.get(0));
		
		action.clickAndHold(selectables.get(1));
		action.clickAndHold(selectables.get(2));
		action.clickAndHold(selectables.get(3));
		action.build().perform();
	
	}

}
