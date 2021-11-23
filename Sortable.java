package jquery;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();

			driver.get("https://jqueryui.com/sortable/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
												
			Thread.sleep(3000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)");
			  
			  
			  File src = driver.getScreenshotAs(OutputType.FILE);
			  File dest=new File("./shot/snap.png");
			  FileUtils.copyFile(src, dest);
			  
			  
			  
			 
			//x=horizontal,y=vertical
			  
			
			/*
			 * driver.switchTo().frame(0); WebElement item1 =
			 * driver.findElement(By.xpath("//ul[@id='sortable']/li[1]")); WebElement item2
			 * = driver.findElement(By.xpath("//ul[@id='sortable']/li[5]")); WebElement
			 * item3 = driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
			 * WebElement item6 =
			 * driver.findElement(By.xpath("//ul[@id='sortable']/li[6]")); WebElement item4
			 * = driver.findElement(By.xpath("//ul[@id='sortable']/li[4]")); Actions act =
			 * new Actions(driver);
			 * 
			 * 
			 * 
			 * int sixX=item6.getLocation().getX(); int sixY=item6.getLocation().getY();
			 * 
			 * 
			 * // Thread.sleep(2000); act.dragAndDropBy(item1, sixX, sixY).perform();
			 */

	}

}
