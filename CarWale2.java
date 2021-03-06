package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		driver.findElement(By.xpath("//span[text()='Used']")).click();
		driver.findElement(By.xpath("//div[text()='Choose your Budget']")).click();

		WebElement slider1 = driver.findElement(By.xpath("(//button)[1]"));
		int minValue = 4;
		int maxValue = 15;

		Actions builder = new Actions(driver);
		boolean flag = true;
		
		while (flag) {
			int offset = 10;
			
			builder.clickAndHold(slider1).moveByOffset(offset, 0).perform();
			String value = slider1.getAttribute("aria-valuenow");
			
		//	System.out.println("Value :" + value);
			
			
			if (Integer.parseInt(value) == minValue) {
				builder.click().perform();
				flag = false;
			}
			offset = offset + 10;
		}
		
		WebElement slider2 = driver.findElement(By.xpath("(//button)[2]"));
		
		boolean flag1 = true;
		while (flag1) {
			int offset = -10;
			builder.clickAndHold(slider2).moveByOffset(offset, 0).perform();
			String value1 = slider2.getAttribute("aria-valuenow");
		
			if (Integer.parseInt(value1) == maxValue) {
				builder.click().perform();
				flag1 = false;
			}
			offset = offset + 10;
		}
	}

}
