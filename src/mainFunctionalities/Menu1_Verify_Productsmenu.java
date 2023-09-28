package mainFunctionalities;

import java.util.Arrays;

import javax.swing.JOptionPane;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Menu1_Verify_Productsmenu {

	public static void main(String[] args) throws Exception
	{
		
		String email = JOptionPane.showInputDialog("Enter the Email ID"); //sree123@gmail.com
		String password = JOptionPane.showInputDialog("Enter the password "); //Sree123
		
		
		//WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-popup-blocking"));
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
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
       
       	driver.manage().deleteAllCookies();       			
             	
      //Create Object JavaScriptExecutor
		
      	JavascriptExecutor js =(JavascriptExecutor)driver;
       	
       	//Navigating to Products Menu
       	driver.findElement(By.xpath("//a[@href='/products']")).click();
       	driver.manage().deleteAllCookies();
       	
       	//Scroll down little
       	js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		
		//Click om each menu inside product
		driver.findElement(By.xpath("//a[@href='#Women']")).click();    //Women
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#Men']")).click();     //Men
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#Kids']")).click();    //Kids
		Thread.sleep(2000);
		
		//Scroll down little
       	js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Polo']")).click();    //Brand -POLO
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();    //Brand -H&M
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Madame']")).click();    //Brand -Madame
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Mast & Harbour']")).click();    //Brand-Mast&harbour
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Babyhug']")).click();    //Brand -Babyhug
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Allen Solly Junior']")).click();    //Brand -Allen Solly Junior
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Kookie Kids']")).click();    //Brand -Kookie Kids
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/brand_products/Biba']")).click();    //Brand -Biba
		Thread.sleep(2000);
		
		driver.close();
		
       	
	}

}
