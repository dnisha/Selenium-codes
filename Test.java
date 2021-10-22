package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://opensource-demo.orangehrmlive.com/";
		driver.get(baseUrl);

	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	System.out.println("Username Inserted");
	
	//*[@id="txtPassword"]
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123 ");
	System.out.println("Pasword Inserted");
	
	
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println("Login Clicked");


//		driver.quit();

		}

}
