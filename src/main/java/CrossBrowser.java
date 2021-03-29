import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser {

    String browser;
    WebDriver driver;

    public void setBrowser(){
        browser="Internet";
    }

    public void BrowserConfig(){

        if(browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\selenium\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        if(browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\selenium\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        if(browser.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\selenium\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        if(browser.equals("Internet")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\selenium\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

    }

    public void runCrossBrowser(){
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }


}
