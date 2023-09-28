package mainFunctionalities;

import javax.swing.JOptionPane;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu2_Home_Scrolldown_VerifySubcription 
{

	public static void main(String[] args) throws Exception
	{
		//Scroll down to webelement  SUBCRIPTION at the bottom
		
		//Verify text 'SUBSCRIPTION'
		
		String email = JOptionPane.showInputDialog("Enter the Email ID");//sree123@gmail.com
		String password = JOptionPane.showInputDialog("Enter the password "); //Sree123
		
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
       	
		WebElement subscription=driver.findElement(By.xpath("//*[@id=\"susbscribe_email\"]"));
       	js.executeScript("arguments[0].scrollIntoView();",subscription);
       	
		Thread.sleep(4000);
		
		driver.findElement(By.id("susbscribe_email")).sendKeys("sreepillai2019@gmail.com");
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
		
       	Thread.sleep(2000);
      				
    	driver.close();

}
}