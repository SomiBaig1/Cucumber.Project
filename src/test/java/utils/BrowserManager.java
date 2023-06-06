package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class BrowserManager {
    public static ChromeDriver getChromeDriver(){
        ChromeOptions chromeOptions=new ChromeOptions();

        chromeOptions.addArguments("--disable-notifications");
        ChromeDriver chromeDriver=new ChromeDriver(chromeOptions);
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
        chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
        return chromeDriver;
    }
    public static FirefoxDriver getFireFoxDriver(){
        FirefoxOptions firefoxOptions=new FirefoxOptions();

        firefoxOptions.addArguments("--disable-notifications");
        firefoxOptions.addArguments("--remote-allow-origins=*");
        FirefoxDriver firefoxDriver=new FirefoxDriver(firefoxOptions);
        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
        firefoxDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
        return firefoxDriver;
    }
}
