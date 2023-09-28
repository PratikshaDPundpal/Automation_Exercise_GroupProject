package mainFunctionalities;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_LogoutUsingScanner {

	public static void main(String[] args) throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Email Address ");
		String email = s.next();
				
		System.out.println("Enter Password ");
		String password = s.next();
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.get("https://automationexercise.com/login");
		Thread.sleep(2000);
	
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(email);  //email id
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password); // Password *pwd*
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click(); // Login button
       	Thread.sleep(2000);
       	
       	String expected_title = "Your email or password is incorrect!";
       	//String actual_title = driver.getTitle();
       			
       	if(expected_title == "Your email or password is incorrect!") //If credentials are wrong then also browser will get closed
       	{
       		//Thread.sleep(2000);
        	
            driver.close();
       	}
    	
       	
    	
       	else
       	{
      
       // driver.findElement(By.xpath("//p[@style='color: red;']"));
       	driver.findElement(By.xpath("//a[@href='/logout']")); // Logout   -- If credentials are correct then after logout browser get closed
     	Thread.sleep(2000);
        driver.close();
       	}
       	
       	
		
	}

}
