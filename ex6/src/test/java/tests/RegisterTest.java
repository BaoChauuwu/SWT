package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.RegisterPage;
import utils.DriverFactory;

public class RegisterTest {
    WebDriver driver;
    RegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.get("http://localhost:8080/Register/Student"); // Cập nhật URL thực tế
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void testRegisterStudentSuccessfully() {
        registerPage.enterEmail("student@example.com");
        registerPage.enterFullName("Nguyen Van A");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.enterPhone("0123456789");
        registerPage.agreeToTerms();
        registerPage.clickRegister();

        // Add assert if redirect or success message
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
