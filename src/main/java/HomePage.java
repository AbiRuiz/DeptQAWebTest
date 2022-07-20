import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By buttonWorkLink = By.linkText("Work");
    private By buttonMenuLink = By.xpath("/html/body/div[1]/button");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WorkPage clickButtonWork() {
        driver.findElement(buttonWorkLink).click();
        return new WorkPage(driver);
    }

    public MenuPage clickButtonMenu() {
        driver.findElement(buttonMenuLink).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new MenuPage(driver);
    }

}