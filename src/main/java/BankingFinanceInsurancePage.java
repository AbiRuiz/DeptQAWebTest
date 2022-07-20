import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankingFinanceInsurancePage {

    private WebDriver driver;
    private By buttonGetInContact = By.id("block-industry-post-header-e0e885e6fa6ab4a444427e9b2e946de5");
    private By companyField = By.id("321011_26169pi_321011_26169");
    private By firstNameField = By.id("321011_26171pi_321011_26171");
    private By lastNameField = By.id("321011_26173pi_321011_26173");
    private By emailField = By.id("321011_26175pi_321011_26175");
    private By phoneField = By.id("321011_26177pi_321011_26177");
    private By messageField = By.id("321011_26179pi_321011_26179");
    protected By termsConditionsCheck = By.id("321011_35226pi_321011_35226");
    protected By reciveNewsCheck = By.id("321011_35228pi_321011_35228");
    private By sendItButton = By.xpath("//*[@id=\"pardot-form\"]/div/div/input");

    public BankingFinanceInsurancePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getbuttonGetInContact(){
        driver.findElement(buttonGetInContact).click();
    }

    public void setCompany(String company){
        driver.findElement(companyField).sendKeys(company);
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setMessage(String message){
        driver.findElement(messageField).sendKeys(message);
    }

    public void termsConditionsCheck(){
        driver.findElement(buttonGetInContact).click();
    }

    public void reciveNewsCheck(){
        driver.findElement(buttonGetInContact).click();
    }

    public AlertTextFormPage clickSendItButton(){
        driver.findElement(buttonGetInContact).click();
        return new AlertTextFormPage(driver);
    }
}
