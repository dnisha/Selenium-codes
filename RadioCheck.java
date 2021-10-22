package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class RadioCheck {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);

	driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
	System.out.println("Radio1 Clicked");
	
	driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
	System.out.println("Radio2 Clicked");
	
	driver.findElement(By.xpath("//*[@id=\"vfb-7-3\"]")).click();
	System.out.println("Radio3 Clicked");
	
	
      WebElement Check1	= driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));
      Check1.click();
      
 



//		driver.quit();


	}
}
