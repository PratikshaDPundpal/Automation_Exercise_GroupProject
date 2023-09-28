package basicPrograms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter 1 for GOOGLE CHROME \n Enter 2 for MICROSOFT EDGE \n Enter 3 for MOZZILA FIREFOX");
		int input = s.nextInt();
		
		WebDriver driver = null;
		
		switch(input) {
		case 1:
			System.out.println("Google Chrome");
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
			
			driver= new ChromeDriver();
			break;
		case 2:
			System.out.println("Microsoft Edge");
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\ChromeDriver\\chromedriver-win64\\edgedriver.exe");
			
			driver= new EdgeDriver();
			break;
		case 3:
			System.out.println("Mozzlia Firefox");
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\ChromeDriver\\chromedriver-win64\\geckodriver.exe");
			
			driver= new FirefoxDriver();
			break;
		case 4:
			default:
				System.out.println("Invalid Input");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.automationexercise.com/");
		Thread.sleep(2000);
		driver.close();

	}

}
