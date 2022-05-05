package learnwork;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		/*TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("D:\\All selenium\\Screenshot\\image.jpg");
		FileHandler.copy(sourcefile, destinationfile);
		*/
		
		
		
		WebElement alert1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alert1.click();
		
		Robot robot=new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
        BufferedImage source=robot.createScreenCapture(rectangle);	
        File destination=new File("D:\\All selenium\\Screenshot\\image.jpg");
        ImageIO.write(source,"png", destination);
	
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert confirm=driver.switchTo().alert();
		Thread.sleep(3000);
		confirm.dismiss();
		
	WebElement promptbox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
	promptbox.click();
	Alert prompt=driver.switchTo().alert();
	Thread.sleep(3000);
	prompt.sendKeys("music");
	prompt.accept();
	
	}

}
