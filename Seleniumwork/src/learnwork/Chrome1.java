package learnwork;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Client\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");

	}

}
