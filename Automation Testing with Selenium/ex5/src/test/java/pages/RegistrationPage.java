package pages;

import org.openqa.selenium.*;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameField = By.id("firstName");
    private final By lastNameField = By.id("lastName");
    private final By emailField = By.id("userEmail");
    private final By maleRadio = By.xpath("//label[text()='Male']");
    private final By femaleRadio = By.xpath("//label[text()='Female']");
    private final By otherRadio = By.xpath("//label[text()='Other']");
    private final By mobileField = By.id("userNumber");
    private final By dateOfBirthInput = By.id("dateOfBirthInput");
    private final By subjectInput = By.id("subjectsInput");

    private final By sportsCheckbox = By.xpath("//label[text()='Sports']");
    private final By readingCheckbox = By.xpath("//label[text()='Reading']");
    private final By musicCheckbox = By.xpath("//label[text()='Music']");

    private final By uploadPictureInput = By.id("uploadPicture");
    private final By addressTextArea = By.id("currentAddress");
    private final By stateDropdown = By.id("react-select-3-input");
    private final By cityDropdown = By.id("react-select-4-input");
    private final By submitButton = By.id("submit");

    public void enterFirstName(String firstName) {
        type(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        type(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        type(emailField, email);
    }

    public void selectGender(String gender) {
        switch (gender.toLowerCase()) {
            case "male":
                click(maleRadio);
                break;
            case "female":
                click(femaleRadio);
                break;
            case "other":
                click(otherRadio);
                break;
        }
    }

    public void enterMobile(String mobile) {
        type(mobileField, mobile);
    }

    public void selectDateOfBirth(String date) {
        click(dateOfBirthInput);
        WebElement input = waitForVisibility(dateOfBirthInput);
        input.sendKeys(Keys.CONTROL + "a");
        input.sendKeys(date);
        input.sendKeys(Keys.ENTER);
    }

    public void enterSubject(String subject) {
        type(subjectInput, subject);
        waitForVisibility(subjectInput).sendKeys(Keys.ENTER);
    }

    public void selectHobbies(String... hobbies) {
        for (String hobby : hobbies) {
            switch (hobby.toLowerCase()) {
                case "sports":
                    click(sportsCheckbox);
                    break;
                case "reading":
                    click(readingCheckbox);
                    break;
                case "music":
                    click(musicCheckbox);
                    break;
            }
        }
    }

    public void uploadPicture(String filePath) {
        type(uploadPictureInput, filePath);
    }

    public void enterAddress(String address) {
        type(addressTextArea, address);
    }

    public void selectState(String state) {
        type(stateDropdown, state);
        waitForVisibility(stateDropdown).sendKeys(Keys.ENTER);
    }

    public void selectCity(String city) {
        type(cityDropdown, city);
        waitForVisibility(cityDropdown).sendKeys(Keys.ENTER);
    }

    public void submitForm() {
        WebElement submit = waitForVisibility(submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
    }

}
