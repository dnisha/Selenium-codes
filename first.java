package selenium;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class first {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	String baseUrl = "https://www.cdac.in/";
	String expectedTitle = "C-DAC: Centre for Development of Advanced Computing, India";
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


