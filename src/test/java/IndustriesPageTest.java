import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class IndustriesPageTest extends BaseTest{

    @Test
    public void getclickButtonIndustries() {
        MenuPage menuPage = homePage.clickButtonMenu();
        IndustriesPage industriesPage = menuPage.clickButtonIndustries();
    }
}
