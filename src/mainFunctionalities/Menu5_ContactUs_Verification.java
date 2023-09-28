package mainFunctionalities;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu5_ContactUs_Verification {

	public static void main(String[] args) throws InterruptedException
	{
		String email = JOptionPane.showInputDialog("Enter the Email ID");
		String password = JOptionPane.showInputDialog("Enter the password ");
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		driver.get("https://automationexercise.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(email); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password); 
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click(); 
       	Thread.sleep(2000);
     
       	driver.manage().deleteAllCookies();
       	
      //Navigating to Contact Us Menu
       	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[9]/a")).click();
       	driver.manage().deleteAllCookies();
       	
       	driver.findElement(By.name("name")).sendKeys("Sreeja Nair");
    	driver.findElement(By.name("email")).sendKeys("sreepillai2019@gmail.com");
    	driver.findElement(By.name("subject")).sendKeys("FeedBack about items ordered");
      	driver.findElement(By.id("message")).sendKeys("Item purchased was of damaged.Need to replace it");
    
      	Thread.sleep(2000);
      	//Scroll down little
       	js.executeScript("window.scrollBy(0,400)");
      	
    	driver.findElement(By.xpath("//input[@class='btn btn-primary pull-left submit_form'")).click();
    	
    	Thread.sleep(2000);    	
    	
    	
    	driver.close();
    	
       	
      
	}

}
