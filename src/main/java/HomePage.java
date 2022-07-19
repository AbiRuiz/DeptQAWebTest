import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By buttonWorkLink = By.linkText("Work");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WorkPage clickButtonWork() {
        driver.findElement(buttonWorkLink).click();
        return new WorkPage(driver);
    }
}