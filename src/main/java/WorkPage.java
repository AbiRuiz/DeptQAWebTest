import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkPage {

    private WebDriver driver;
    private By buttonPlusCategories = By.xpath("//*[@id=\"all-work\"]/div/div[1]/div/div[1]/button");
    private By buttonTechnology = By.xpath("//*[@id=\"all-work\"]/div/div[1]/div/div[1]/div/button[12]");


    public WorkPage(WebDriver driver) {
        this.driver = driver;
    }

    public TechnologyPage clickTechnology() {
        driver.findElement(buttonPlusCategories).click();
        driver.findElement(buttonTechnology).click();
        return new TechnologyPage(driver);
    }

}
