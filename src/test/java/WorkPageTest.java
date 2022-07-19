import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WorkPageTest extends BaseTest{
    @Test
    public void technologyPageButton() {
        WorkPage workPage = homePage.clickButtonWork();
        System.out.println("asdasd"); //printeando cosas para verificar hasta donde llega el test
        WorkPage workPage1 = workPage.clickPlusCategories();
        System.out.println("hasta aca llego");  //printeando cosas para verificar hasta donde llega el test
        TechnologyPage technologyPage = workPage1.clickTechnology();
        System.out.println("hasta aca llego 1");  //printeando cosas para verificar hasta donde llega el test
        RalphLaurenPage ralphLaurenPage = technologyPage.clickButtonRalphLauren();
        assertTrue(ralphLaurenPage.getVerify().contains("Ralph Lauren"));
    }
}
