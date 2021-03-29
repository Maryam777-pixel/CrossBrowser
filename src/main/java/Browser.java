import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    WebDriver driver;
    public void Chrome(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }



}
