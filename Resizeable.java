package jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resizable/");
		
		 Actions actions =new Actions(driver);
		 driver.switchTo().frame(0);  
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
	        WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	      
	        driver.executeScript("argument[0].setAttributes('style',arguments[1]);",
	        		resize,"color: Yellow:border:10px dotted slolid green;");  
	        
	        
	        
	        
	  actions.clickAndHold(resize).moveByOffset(120, 120).perform();
	
	
	}

}
