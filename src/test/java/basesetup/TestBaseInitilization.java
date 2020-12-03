package basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseInitilization {
    WebDriver driver;

    public WebDriver intilizeDriver() {
    System.setProperty("webdriver.chrome.driver","/Users/mastan/Desktop/EggTimer-Maersk/src/test/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
}
}
