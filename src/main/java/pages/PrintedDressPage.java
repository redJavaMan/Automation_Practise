package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintedDressPage {
    private WebDriver driver;
    private By setQuantity = By.cssSelector("input#quantity_wanted");
    private By setSize = By.cssSelector("select#group_1");
    private By clickAddToCart = By.xpath("//span[text()='Add to cart']");
    private By clickProceed2ChkOut = By.xpath("//a[@title='Proceed to checkout']");

    public PrintedDressPage(WebDriver driver){
        this.driver = driver;
    }
    public void setQuantity(String  quantity){
        driver.findElement(setQuantity).sendKeys(Keys.BACK_SPACE,quantity);
    }
    public void selectSize(String size){
        Select dropDownSize = new Select(driver.findElement(setSize));
        dropDownSize.selectByVisibleText(size);
    }
    public void AddToCart(){
        driver.findElement(clickAddToCart).click();
    }
    public OrderPage proceed2CheckOut(){
        driver.findElement(clickProceed2ChkOut).click();
        return new OrderPage(driver);
    }
}
