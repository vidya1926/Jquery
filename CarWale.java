package jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		
		
	//	ChromeDriver driver = new ChromeDriver();
		
	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.carwale.com/");
	  
	  driver.findElement(By.xpath("//span[text()='Used']")).click();
	  driver.findElement(By.
	  xpath("(//input[contains(@class,'o-dqBOwT o-cKuOoN')])[2]")).sendKeys(
	  "Chennai");
	  driver.findElement(By.xpath("//li[@label='Chennai, Tamil Nadu']//div[1]")).
	  click();
	  WebElement slide1=
	  driver.findElement(By.xpath("//button[@data-handle-key='0']//div[1]"));
	  WebElement slide2 =
	  driver.findElement(By.xpath("//button[@data-handle-key='1']//div[1]"));
	  Actions actions =new Actions(driver);
	  
	  actions.clickAndHold(slide1).moveByOffset(64,0).release(slide1).perform();
	  
	
	  actions.dragAndDropBy(slide2,-130, 0).release(slide2).perform();
	  Thread.sleep(2000); String rangeVal =
	  driver.findElement(By.xpath("//div[text()='4 - 12 Lakh']")).getText();
	  System.out.println("Selected range:" +rangeVal);
	 
       
	
		

	}
	

}
