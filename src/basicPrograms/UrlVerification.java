package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.automationexercise.com/");
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.manage().window().maximize();
		String expectedUrl = "https://www.automationexercise.com/";
		if(URL.equalsIgnoreCase(expectedUrl))
			System.out.println("URL verified");
		else
			System.out.println("URL didn't match");
		
		
		driver.quit();

	}

}
