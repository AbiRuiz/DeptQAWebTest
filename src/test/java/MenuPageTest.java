import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MenuPageTest extends BaseTest{

    @Test
    public void getclickButtonMenu() {
        MenuPage menuPage = homePage.clickButtonMenu();
    }
}