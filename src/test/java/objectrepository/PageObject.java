package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class PageObject {


    public String eggTimer_url = "https://e.ggtimer.com/";
    public String enterText_in_Secs = "60";


    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[4]/button")
    public WebElement needHelp;

    public By needHelp1 = By.xpath("//*[@id=\"root\"]/div/div/div[4]/button");
    public By enter_text_field = By.xpath("//*[@id=\"EggTimer-start-time-input-text\"]");
    public By start_button = By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div[1]/button");
    public By clickOn_5Mins = By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div[3]/a[1]");
    public By clickOn_10Mins = By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div[3]/a[2]");
    public By refresh_button = By.xpath("//*[@id=\"root\"]/div/main/div[3]/div[2]/button[1]/svg");
    public By back_Key = By.xpath("/html/body/div/div/main/div[3]/div[2]/select");
    public By In_Help_page = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/article[1]/p[2]/a");
}
