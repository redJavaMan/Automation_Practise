package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    private WebDriver driver;
    private By createAccount = By.cssSelector("input#email_create");
    private By gender = By.cssSelector("input#id_gender1");
    private By firstName = By.cssSelector("input#customer_firstname");
    private By lastName = By.cssSelector("input#customer_lastname");
    private By password = By.cssSelector("input#passwd");
    private By day = By.cssSelector("select#days");
    private By month = By.cssSelector("select#months");
    private By year = By.cssSelector("select#years");
    private By company =By.cssSelector("input#company");
    private By address = By.cssSelector("input#address1");
    private By city = By.cssSelector("input#city");
    private By state = By.cssSelector("select#id_state");
    private By postalCode = By.cssSelector("input#postcode");
    private By phoneNo = By.cssSelector("input#phone_mobile");
    private By clickRegister = By.id("submitAccount");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void createAccount(String email){
        driver.findElement(createAccount).sendKeys(email, Keys.ENTER);
    }
    public void selectGender(){
        driver.findElement(gender).click();
    }
    public void enterFirstName(String enterFirstName){
        driver.findElement(firstName).sendKeys(enterFirstName);
    }
    public void enterLastName(String enterLastName) {
        driver.findElement(lastName).sendKeys(enterLastName);
    }
    public void enterPassword(String enterPassword){
        driver.findElement(password).sendKeys(enterPassword);
    }
    public void selectDay(String enterDay) {
        Select days = new Select(driver.findElement(day));
        days.selectByValue(enterDay);
    }
    public void selectMonth(String enterMonth) {
        Select months = new Select(driver.findElement(month));
        months.selectByVisibleText(enterMonth);
    }
    public void selectYear(String enterYear) {
        Select years = new Select(driver.findElement(year));
        years.selectByValue(enterYear);
    }
    public void enterCompany(String enterCompany){
        driver.findElement(company).sendKeys(enterCompany);
    }
    public void enterAddress(String enterAddress) {
        driver.findElement(address).sendKeys(enterAddress);
    }
    public void enterCity(String enterCity) {
        driver.findElement(city).sendKeys(enterCity);
    }
    public void selectState(String enterState) {
        Select states = new Select(driver.findElement(state));
        states.selectByVisibleText(enterState);
    }
    public void enterPostalCode(String enterPostalCode) {
        driver.findElement(postalCode).sendKeys(enterPostalCode);
    }
    public void enterPhoneNo(String enterPhoneNo) {
        driver.findElement(phoneNo).sendKeys(enterPhoneNo);
    }
    public AddressPage clickRegister(){
        driver.findElement(clickRegister).click();
        return new AddressPage(driver);
    }

}
