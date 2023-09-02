package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BassClass {
	
 public static	WebDriver driver;
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mano\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public static void inputData(WebElement element,String inputData)
	{
		try {
			waitforWebEl;
			if(elementisDisplayed(element))
			{
				element.sendKeys(inputData);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	

}
