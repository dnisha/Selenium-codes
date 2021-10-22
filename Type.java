package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Type {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		WebElement txt = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Actions builder = new Actions(driver);
		
		Action seriesOfActions = builder.moveToElement(txt).click().keyDown(txt, Keys.SHIFT)
				.sendKeys(txt, "selenium webdriver java")
				.keyUp(txt, Keys.SHIFT)
				.doubleClick(txt)
				.contextClick()
				.build();
				seriesOfActions.perform() ;

		

//		driver.close();

		}

}
