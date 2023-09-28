package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.automationexercise.com/");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.manage().window().maximize();
		String expectedTitle = "Automation Exercise";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		driver.navigate().to("https://www.automationexercise.com/test_cases");
		driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
		
		driver.close();
		driver.quit();
	}

}
