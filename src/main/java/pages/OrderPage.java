package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    private By clickProceedToCheckOutOrderPage = By.xpath("//p//a[@title='Proceed to checkout']");
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage proceedToCheckOutOrderPage(){
        driver.findElement(clickProceedToCheckOutOrderPage).click();
        return new LoginPage(driver);
    }
}
