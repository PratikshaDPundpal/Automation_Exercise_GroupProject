package mainFunctionalities;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_LogoutUsingJoptionPane
{

	public static void main(String[] args) throws Exception
	{
		
		// using input dialogbox(Joptionpane)
		String email = JOptionPane.showInputDialog("Enter the Email ID");
		String password = JOptionPane.showInputDialog("Enter the password ");
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://automationexercise.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(email); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password); 
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click(); 
       	Thread.sleep(2000);
       	
       	String expected_title = "Your email or password is incorrect!";
       	Thread.sleep(2000);
       	
       			
       	if(expected_title == "Your email or password is incorrect!") //If credentials are wrong then also browser will get closed
       	{
              	
            driver.close();
       	}  	
       	else
       	{
      
        driver.findElement(By.xpath("//a[@href='/logout']")).click(); // Logout   -- If credentials are correct then after logout browser get closed
     	Thread.sleep(2000);
        driver.close();
       	}
       	
       	
	}

}




