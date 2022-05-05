package learnwork;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\All selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		
		WebElement downloadbutton=driver.findElement(By.id("downloadButton"));
		downloadbutton.click();
		
		//windows action starts
		
		File filelocation=new File("C:\\Users\\Client\\Downloads");
		
		File[] totalfiles=filelocation.listFiles();
		for (File file : totalfiles) 
		{
			if(file.getName().equals("sample file"))
			{
				System.out.println("FILE IS DOWNLOADED");
			break;
			
			}
			else
			{System.out.println("no file exist");
			break;
			}
			}
		}
			
	}


