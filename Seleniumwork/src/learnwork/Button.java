package learnwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getpositionbutton=driver.findElement(By.id("position"));
		Point xypoint=getpositionbutton.getLocation();
		int xpoint=xypoint.getX();
		int ypoint=xypoint.getY();
		System.out.println("x value:"+xpoint);
		System.out.println("y value:"+ypoint );
		
		WebElement colorbutton=driver.findElement(By.id("color"));
		String color=colorbutton.getCssValue("background-color");
		System.out.println("color"+ color);
		
		WebElement sizebutton=driver.findElement(By.id("size"));
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();
		System.out.println("height:"+ height);
		System.out.println("width:"+width);
		
		WebElement homebutton=driver.findElement(By.id("home"));
		homebutton.click();
	}

}
