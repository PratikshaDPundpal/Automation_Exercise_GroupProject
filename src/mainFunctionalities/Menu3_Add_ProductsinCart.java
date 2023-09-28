package mainFunctionalities;

import java.util.Arrays;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Menu3_Add_ProductsinCart {

	public static void main(String[] args) throws InterruptedException
	{
		//Verify the products are getting added in cart from products menu
		
		String email = JOptionPane.showInputDialog("Enter the Email ID");
		String password = JOptionPane.showInputDialog("Enter the password ");
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-popup-blocking"));
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
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
       
       	
     //Navigating to Products Menu
       	driver.findElement(By.xpath("//a[@href='/products']")).click();
       	driver.manage().deleteAllCookies();
       	
       	//Scroll down little
       	js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='product-overlay']")).click(); // hove over the first product
		Thread.sleep(2000);
		
	//Add first item
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/a")).click();// click add to cart
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();//click continue shopping
		Thread.sleep(2000);
		
	//Add second item
		
		driver.findElement(By.xpath("//html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]")).click();// hove over the second product
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();// click add to cart
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click(); //click continue shopping
		Thread.sleep(2000);
		
		
		driver.manage().deleteAllCookies();
		js.executeScript("window.scrollBy(400,0)");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a']")).click();  // Check in the cart
		Thread.sleep(2000);
		
		
		
		driver.close();
	}

}
