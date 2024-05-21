package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newproject {

	public static void main(String[] args) {
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("APjFqb"));
		element.sendKeys("swag labs");
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		driver.findElement(By.cssSelector("#hdtb-sc > div > div > div.crJ18e > div > div:nth-child(2) > a > div")).click();
		// TODO Auto-generated method stub

	}

}
