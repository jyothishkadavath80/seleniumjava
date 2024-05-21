package seleniumjava;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newfirstclass {

	public static  void main(String[] args) {
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\Admin\\Downloads\\CHROME DRIVER ORIGINAL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("APjFqb"));
		element.sendKeys("youtube");
		element.sendKeys(Keys.ENTER);
		
		// TODO Auto-generated method stub

	}

}
