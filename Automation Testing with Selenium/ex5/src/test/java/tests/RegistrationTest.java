package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
    WebDriver driver;
    RegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Tự tải ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        registrationPage = new RegistrationPage(driver);
        registrationPage.navigateTo("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void testValidRegistrationForm() {
        registrationPage.enterFirstName("Bảo");
        registrationPage.enterLastName("Châu");
        registrationPage.enterEmail("chau@example.com");
        registrationPage.selectGender("Male");
        registrationPage.enterMobile("0912345678");
        registrationPage.selectDateOfBirth("20 Jul 2025");
        registrationPage.enterSubject("Math");
        registrationPage.selectHobbies("Sports", "Music");
        registrationPage.uploadPicture(System.getProperty("user.dir") + "/src/test/resources/test-pic.png");
        registrationPage.enterAddress("123 Đà Nẵng");
        registrationPage.selectState("NCR");
        registrationPage.selectCity("Delhi");
        registrationPage.submitForm();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
