package basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING 04-07-2023\\Browser Extension\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
  
        Actions a = new Actions(driver);
        List<WebElement>ls = driver.findElements(By.xpath("//div[@class='shop-menu pull-right']//ul/li"));
        
        int size = ls.size();
        System.out.println("No of elements: "+size);
        
        for(int i=1; i<=size; i++)
        {
        	Thread.sleep(2000);
        	System.out.println(driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//ul/li["+i+"]")).getText());
        	a.moveToElement(driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//ul/li["+i+"]"))).click().perform();
        	Thread.sleep(2000); 
            
        }
        driver.navigate().back();
        Thread.sleep(1000); 
        driver.quit();
        
       
    }
}




