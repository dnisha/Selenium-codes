package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			String baseUrl = "https://www.demoqa.com/";
			String expectedTitle = "ToolsQA";
			String actualTitle;
			driver.get(baseUrl);

			driver.findElement(By.id("firstName"));
			System.out.println("Found Element");
			
			
			driver.findElement(By.id("userEmail"));
			System.out.println("Found Email Element");
			
			driver.findElement(By.id("genterWrapper"));
			System.out.println("Found Gender Element");
			
			
			
			driver.findElement(By.id("subjects-label"));
			System.out.println("Found Hobbie Element");
			
			
			driver.findElement(By.id("userNumber"));
			System.out.println("Found Mnumber Element");
			
			driver.findElement(By.linkText("dynamicLink"));
			System.out.println("Found Link Element");
			
			driver.close();

			}

	}


