package learnwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
	WebElement emailbox=driver.findElement(By.id("email"));
	emailbox.sendKeys("riaadkitchen@gmail.com");
	
	WebElement appendbox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	appendbox.sendKeys("subscribe my channel");
	
	WebElement gettextbox=driver.findElement(By.name("username"));
	gettextbox.getAttribute("value");
	System.out.println("value");
	
	WebElement clearbox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
	clearbox.clear();
	
	WebElement disabledbox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
	boolean enablecheck=disabledbox.isEnabled();
	System.out.println(enablecheck);
	
	

	
	}

}
