package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=323A853A8CA3F33EA05D090E9E95EBC8");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("arjun");
		driver.findElement(By.id("customer.lastName")).sendKeys("sdfgh");
		driver.findElement(By.id("customer.address.street")).sendKeys("kizsseri");
		driver.findElement(By.id("customer.address.city")).sendKeys("kondotty");
		driver.findElement(By.id("customer.address.state")).sendKeys("delhi");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("568709");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9867453210");
		driver.findElement(By.id("customer.ssn")).sendKeys("dfghjklcvbn");
		driver.findElement(By.id("customer.username")).sendKeys("jkjkjkjk");
		driver.findElement(By.id("customer.password")).sendKeys("90489048");
		driver.findElement(By.id("repeatedPassword")).sendKeys("90489048");
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		//driver.findElement(By.id("#loginPanel > form > div:nth-child(2) > input")).click();
		driver.findElement(By.name("username")).sendKeys("jkjkjkjk");
		driver.findElement(By.name("password")).sendKeys("90489048");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
		driver.findElement(By.cssSelector("#rightPanel > p:nth-child(4) > a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[1]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[2]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[3]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[4]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[5]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[6]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[3]/tbody/tr[1]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[3]/tbody/tr[2]/td[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[5]/tbody/tr/td/a[1]")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[5]/tbody/tr/td/a[2]")).click();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[1]/form/table/tbody/tr/td[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[1]/form/table/tbody/tr/td[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[2]/form/table/tbody/tr/td[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/table[2]/tbody/tr[1]/td/a[1]")).click();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/table[2]/tbody/tr[1]/td/a[3]")).click();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");
		driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
		driver.findElement(By.id("name")).sendKeys("sharath");
		driver.findElement(By.id("email")).sendKeys("krishnan@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7034903470");
		driver.findElement(By.id("message")).sendKeys("asdfghj zxcvbnm ");
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
		driver.get("https://parabank.parasoft.com/parabank/contact.htm");
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[3]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[3]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
		driver.findElement(By.name("payee.name")).sendKeys("rafi");	
		driver.findElement(By.name("payee.address.street")).sendKeys("kollam");
		driver.findElement(By.name("payee.address.city")).sendKeys("fghjrrr");
		driver.findElement(By.name("payee.address.state")).sendKeys("gujarath");
		driver.findElement(By.name("payee.address.zipCode")).sendKeys("333435");
		driver.findElement(By.name("payee.phoneNumber")).sendKeys("8182838485");
		driver.findElement(By.name("payee.accountNumber")).sendKeys("898907687654321");
		driver.findElement(By.name("verifyAccount")).sendKeys("898907687654321");
		driver.findElement(By.name("amount")).sendKeys("100");
		driver.findElement(By.name("fromAccountId")).sendKeys("arjun");
		driver.findElement(By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[14]/td[2]/input")).click();
		driver.close();


	}

}
