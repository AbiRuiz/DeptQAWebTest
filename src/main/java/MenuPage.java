import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

    private WebDriver driver;
    private By buttonIndustriesLink = By.xpath("/html/body/div[1]/ul[1]/li[1]/a");

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public IndustriesPage clickButtonIndustries(){
        driver.findElement(buttonIndustriesLink).click();
        return new IndustriesPage(driver);
    }
}
