import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CulturePage {

    private WebDriver driver;
    private By buttonPeopleLink = By.xpath("//button[@data-target='#people']");
    private By buttonDimiAlbersLink = By.id("block-panel-people-30fa3382a87be8a705e51230127001f9");
    private By buttonWorkingAtDeptLink = By.linkText("Working at DEPT");


    public CulturePage(WebDriver driver) {
        this.driver = driver;
    }


    public WorkingAtDeptPage clickDimiAlbers() {
        driver.findElement(buttonPeopleLink).click();
        driver.findElement(buttonDimiAlbersLink).click();
        driver.findElement(buttonWorkingAtDeptLink).click();
        return new WorkingAtDeptPage(driver);
    }

}
