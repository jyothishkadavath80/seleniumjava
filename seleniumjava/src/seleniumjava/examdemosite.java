package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examdemosite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.findElement(By.id("recipient-email")).sendKeys("zxcvbnm@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("harisree");
		driver.findElement(By.id("message-text")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
		//driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a")).click();
		//driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		//driver.get("https://demoblaze.com/#");
		//driver.findElement(By.linkText("Laptops")).click();
		//driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		//driver.get("https://demoblaze.com/index.html");
		//driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		
		
       //driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		
		//driver.findElement(By.id("recipient-email")).sendKeys("zxcvbnm@gmail.com");
		//driver.findElement(By.id("recipient-name")).sendKeys("harisree");
		//driver.findElement(By.id("message-text")).sendKeys("testing");
		//driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
		//driver.findElement(By.linkText("Close")).click();
		
		
	
		//driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();


	}

}
