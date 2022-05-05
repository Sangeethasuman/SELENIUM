package learnwork;

import java.awt.List;
import java.util.Iterator;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	WebDriver driver= new ChromeDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		
		WebElement dropbutton1=driver.findElement(By.id("dropdown1"));
		Select choose= new Select(dropbutton1);
		choose.selectByIndex(2);
		
		WebElement dropbutton2=driver.findElement(By.name("dropdown2"));
		Select choose1= new Select(dropbutton2);
		choose1.selectByIndex(3);
		
		WebElement dropbutton3=driver.findElement(By.id("dropdown3"));
		Select choose2= new Select(dropbutton3);
		choose2.selectByIndex(1);
		
		
		
		DropDown drop=new DropDown();
		drop.ans();
	}
		public void ans()
		
		{
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			WebElement dropbutton4=driver.findElement(By.className("dropdown"));
			Select choose3=new Select(dropbutton4);
			java.util.List<WebElement> option=choose3.getOptions();
			int j=option.size();
			/*for(int i=0;i<j;i++)

			{
			*/
				int z=j-2;
				System.out.println(option.get(z).getText());
				
				
				
			}
			
			
			/*System.out.println("number:"+ size);*/
			/*for (int i = size; i <= size; i++) {
			
				String z;
				int j=size-1;
				System.out.println(j);
				  */
			}
            

	/*	WebElement dropbutton5=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
				dropbutton5.sendKeys("s");
		
		WebElement dropbutton6=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select multiplebox=new Select(dropbutton6);
		multiplebox.selectByIndex(2);
		*/
		
	


