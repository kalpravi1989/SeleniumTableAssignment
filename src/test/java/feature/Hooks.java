package feature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public static ExtentTest logger;

	@Before
	public void driverSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "./Reports");
		extent.attachReporter(spark);
		FileInputStream file = null;
		Properties prop = null;
		try {
			file = new FileInputStream("./src/test/resources/prop.properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));

	}

	@After
	public void teardown() {
		System.out.println("Close browser");
		driver.quit();
	}

}


