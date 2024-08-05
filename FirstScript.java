package abcpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) throws Exception {
		// Launch the browser
		//System.setProperty("webdriver.gecko.driver", "F:\Drivers\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		// WebDriver d=new ChromeDriver();
		//System.setProperty("webdriver.edge.driver", "F:\\Drivers\\msedgedriver.exe");
		//WebDriver d=new EdgeDriver();
		// Load web page
		d.get("https://www.facebook.com/");
		// Pause 3sec
		Thread.sleep(3000);
		// Close the browser
		d.quit();

	}

}
