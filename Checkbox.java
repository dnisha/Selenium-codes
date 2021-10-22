package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);
		
		
		WebElement option1	= driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));
		
         option1.click();
         System.out.println("Checbox1 Clicked");
         
         if (option1.isSelected()) {
        	 System.out.println("Checkbox1 is Toggled On");
        	 } 
         
         option1.click();
         if (!option1.isSelected()) {
        	 System.out.println("Checkbox1 is Toggled off");
        	 } 
         
     	WebElement option2	= driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]"));
     	option2.click();
     	
     	 if (option2.isSelected()) {
        	 System.out.println("Checkbox2 is Toggled On");
        	 } 
     	option2.click();
     	 
     	 if (!option2.isSelected()) {
        	 System.out.println("Checkbox2 is Toggled off");
        	 } 
     	 
     	WebElement option3	= driver.findElement(By.cssSelector("input[id = \"vfb-6-2\"]"));
     	option3.click();
     	
     	 if (option3.isSelected()) {
        	 System.out.println("Checkbox2 is Toggled On");
        	 } 
     	
     	

}
}
