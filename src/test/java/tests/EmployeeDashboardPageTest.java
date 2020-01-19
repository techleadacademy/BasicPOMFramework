package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeDashboardPage;
import pages.HomePage;

public class EmployeeDashboardPageTest extends TestBase {
    EmployeeDashboardPage employeeDashboardPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
        employeeDashboardPage = new EmployeeDashboardPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test(groups = {"smoke"})
    public void verifyNewsPage(){
        homePage.navigateToHomePage();
        employeeDashboardPage.navigateToNewsPage();
        //Assert.assertEquals(employeeDashboardPage.dashboardTitle.getText(), "News List");
    }


}
