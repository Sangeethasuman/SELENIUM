package learnwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		WebElement firstimage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		firstimage.click();
	    Thread.sleep(3000);
		
		driver.navigate().back();
		WebElement brokenimage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken");
		}
		else 
		{
			System.out.println("image is not broken");
		}
	}
}
