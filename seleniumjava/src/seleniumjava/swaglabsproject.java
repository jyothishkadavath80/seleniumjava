package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabsproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("qwerty");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("sdfghjsdfg");
		driver.findElement(By.id("postal-code")).sendKeys("567896");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
		driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("qwerty");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("sdfghjsdfg");
		driver.findElement(By.id("postal-code")).sendKeys("567896");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		driver.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
		driver.findElement(By.id("inventory_sidebar_link")).click();
		driver.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
		driver.findElement(By.cssSelector("#about_sidebar_link")).click();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		
		//sdriver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Name (Z to A)");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Price (low to high)");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Price (high to low)");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
		driver.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		driver.close();

	}

	}


