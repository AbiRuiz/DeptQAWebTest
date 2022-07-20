import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndustriesPage {

    private WebDriver driver;
    private By buttonBankingFinanceInsuranceLink = By.xpath("/html/body/main/div[2]/div/div[2]/a[3]/span[2]/i/svg/path");

    public IndustriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public BankingFinanceInsurancePage clickButtonBankingFinanceInsurance(){
        driver.findElement(buttonBankingFinanceInsuranceLink).click();
        return new BankingFinanceInsurancePage(driver);
    }
}
