package mainFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp_GroupProject {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://automationexercise.com/");
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sree123@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sree123");
		
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByVisibleText("27");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("August");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("2000");
		Thread.sleep(5000);
		//Select drpdateOfBirth=new Select(drpdateofbirthEle);
		//drpdateOfBirth.selectByVisibleText(day='17');
		driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("Gangwar");
		driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("Tsystem");
		driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("C-116_Rajendra_Nagar");
		driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("Bareilly");
		driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("C-116_Rajendra_Nagar");
		WebElement drpcountryEle=driver.findElement(By.id("country"));
		Select drpcountry=new Select(drpcountryEle);
		drpcountry.selectByVisibleText("Canada");
		//drpcountry.selectByIndex(3);
		driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Utter Pradesh");
		driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Bareilly");
		driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("43122");
		driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("7838002468");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(40,3000)");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
