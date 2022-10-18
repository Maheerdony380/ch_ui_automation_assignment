package in.amazon.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    // global variables
    public static WebDriver driver;
    public static Properties prop;

    // load properties file
    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream inputProperties = new FileInputStream("./src/main/resources/custom.properties");
            prop.load(inputProperties);
        } catch (FileNotFoundException e) {
            System.out.println("Properties FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Properties IOException");
        }
    }

    // init driver
    public static void initDriver(){

        // get browser name
        String browserName = prop.getProperty("ui.browser");

        // setup driver through browser
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            System.out.println("Browser info not found");
        }

        //maximize browser window
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        // navigate to base url
        driver.get(prop.getProperty("ui.baseURL"));
    }
}
