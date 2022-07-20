import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkPage {

    private WebDriver driver;
    private By buttonPlusCategories = By.xpath("//button[@title='Categories']");
    private By buttonTechnology = By.xpath("//button[@data-term-slug='technology']");


    public WorkPage(WebDriver driver) {
        this.driver = driver;
    }

    public WorkPage clickPlusCategories(){
        driver.findElement(buttonPlusCategories).click();
        return new WorkPage(driver);
    }

    public TechnologyPage clickTechnology() {
        driver.findElement(buttonTechnology).click();
        return new TechnologyPage(driver);
    }


}
