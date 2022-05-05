package learnwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
		WebElement radio=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div"));
		Boolean check=radio.isSelected();
		Boolean check1=radio.isSelected();
		System.out.println(check);
		System.out.println(check1);
		
		WebElement radio1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div"));
		String select=radio1.getAttribute("default");
		System.out.println(select);
		
		
	}

}
