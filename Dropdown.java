package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Dropdown {
	
	public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
	driver.get(baseUrl);
     Select x = new Select(driver.findElement(By.name("country")));
     x.selectByIndex(0);
     System.out.println("DropBox index 0 selected");
     Thread.sleep(4000);
    
     
     x.selectByIndex(1);
     System.out.println("DropBox index 1 selected");
     x.deselectByIndex(1);
   
    


//	driver.close();

}
}
