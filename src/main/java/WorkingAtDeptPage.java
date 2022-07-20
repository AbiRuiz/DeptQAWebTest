import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkingAtDeptPage {

    private WebDriver driver;
    private By buttonPeopleLink = By.xpath("//button[@data-target='#people']");


    public WorkingAtDeptPage(WebDriver driver) {
        this.driver = driver;
    }


}
