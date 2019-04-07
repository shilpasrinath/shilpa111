package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	public Testbase() {
		
		try {
			prop =new Properties();
			FileInputStream fis=new FileInputStream("//src//main/java//configeration//config.properities");
	          prop.load(fis);
		}
		
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	public static void intialization() {
		
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
        	WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
			}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.iedriver().setup();
			WebDriver driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
