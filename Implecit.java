package selenium;


import java.util.concurrent.TimeUnit;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Implecit {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();



// setting implicit time step by step
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



// Loading a URL
driver.get("https://www.redbus.in/");



// Locating and typing in From text box.
WebElement fromTextBox= driver.findElement(By.id("src"));
fromTextBox.sendKeys("Ban");



System.out.println("Wait starts at :"+new Date());
// Clicking on first search result
driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
System.out.println("Wait ends at:"+new Date());
//Closing browser
driver.quit();
}
}