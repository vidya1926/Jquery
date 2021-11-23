package jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		Actions actions =new Actions(driver);

		WebElement  item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement  item2= driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement  item3= driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		WebElement  item4= driver.findElement(By.xpath("//li[text()='Item 6']"));
	     actions.keyDown(Keys.CONTROL).click(item4).click(item2).build().perform();
		//actions.clickAndHold(item1).dragAndDrop(item3, item4).build().perform();
		
		
	}

}
