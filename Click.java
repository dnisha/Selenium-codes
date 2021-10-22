package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Click {

	public static void main(String[] args) {
	
		
			System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			String baseUrl = "http://demo.guru99.com/test/login.html";
			driver.get(baseUrl);
			
			
			
		
		driver.findElement(By.id("email")).sendKeys("Deepak");
		System.out.println("Email Inseted");
		
		driver.findElement(By.id("passwd")).sendKeys("Nishad");
		System.out.println("Passward Inseted");
		
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("Button Clicked");
		
		
	}

}
