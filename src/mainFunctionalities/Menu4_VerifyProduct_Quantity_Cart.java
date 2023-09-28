package mainFunctionalities;

import java.util.Arrays;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Menu4_VerifyProduct_Quantity_Cart {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		//Verify the products quantity in cart 
		
				String email = JOptionPane.showInputDialog("Enter the Email ID");
				String password = JOptionPane.showInputDialog("Enter the password ");
				
				//ChromeOptions opt = new ChromeOptions();
				//opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-popup-blocking"));
				
				
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
		       
		       	
		     //Navigating to Products Menu
		       	driver.findElement(By.xpath("//a[@href='/products']")).click();
		       	driver.manage().deleteAllCookies();
		       	
		       	//Scroll down little
		       	js.executeScript("window.scrollBy(0,400)");
				//Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@class='product-overlay']")).click(); // hove over the first product
				//Thread.sleep(2000);
				
			//Add first item
				driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();// click for View Product
				Thread.sleep(2000);
				
				driver.manage().deleteAllCookies();
				
				//Select s = new Select(driver.findElement(By.xpath("//input[@id= 'quantity']")));// To increase the count of products in dropdown to 4
				//s.selectByValue("4");
				
				driver.findElement(By.id("quantity")).sendKeys("4"); // To increase the count of product
				
				
				driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();//click Add to cart
				
				
				driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();// click for View Cart
				Thread.sleep(2000);
				driver.close();
	}

}
