import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class BankingFinanceInsurancePageTest extends BaseTest{

    @Test
    public void form() {
        MenuPage menuPage = homePage.clickButtonMenu();
        IndustriesPage industriesPage = menuPage.clickButtonIndustries();
        BankingFinanceInsurancePage bankingFinanceInsurancePage = industriesPage.clickButtonBankingFinanceInsurance();
        bankingFinanceInsurancePage.setCompany("RLF");
        bankingFinanceInsurancePage.setFirstName("M4");
        bankingFinanceInsurancePage.setLastName("KF");
        bankingFinanceInsurancePage.setEmail("RLF@gmail.com");
        bankingFinanceInsurancePage.setPhone("342234441");
        bankingFinanceInsurancePage.setMessage("Message Default");
        bankingFinanceInsurancePage.termsConditionsCheck();
        bankingFinanceInsurancePage.reciveNewsCheck();
        bankingFinanceInsurancePage.clickSendItButton();
        AlertTextFormPage alertTextFormPage = bankingFinanceInsurancePage.clickSendItButton();
        assertTrue(alertTextFormPage.getAlertText().contains("Thanks!"));
    }


}
