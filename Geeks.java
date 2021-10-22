package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geeks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.geeksforgeeks.org/";
		String expectedTitle = "eeksforGeeks | A computer science portal for geeks";
		String actualTitle;
		driver.get(baseUrl);

		actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)){
		System.out.println("Test Passed!");
		} else {
		System.out.println("Test Failed");
		}


		driver.close();

		}

}
