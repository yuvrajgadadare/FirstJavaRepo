package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public void firstTest() {
		WebDriver driver=new ChromeDriver()
		driver.get("https://ciitstudent.com/");
		driver.manage().window().maximize();
//		String title=driver.getTitle();
//		String url=driver.getCurrentUrl();
//		System.out.println("Title = "+title);
//		System.out.println("Current Url="+url);
//		String code=driver.getPageSource();
//		System.out.println(code);
//		driver.close();
//		driver.quit();
		
//		WebElement email=driver.findElement(By.id("email_address"));
//		email.sendKeys("yuvraj.gadadare@gmail.com");
//		WebElement epass=driver.findElement(By.id("password"));
//		epass.sendKeys("pp");
//		
//		WebElement ebtn=driver.findElement(By.xpath("//*[@type='submit']"));
//		ebtn.click();
		
		
		
		WebElement link=driver.findElement(By.xpath("//*[@href='/guest-registration-form']"));
		link.click();
	}
	
	public void CIITTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ciitinstitute.com/");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.xpath("//*[@href='/ciit-blogs']"));
		link.click();
	}
	public static void main(String[] args) {
		 Program p=new Program();
//		 p.firstTest();
		 p.CIITTest();
	}

}
