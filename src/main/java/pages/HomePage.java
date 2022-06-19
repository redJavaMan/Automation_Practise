package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By clickDresses = By.xpath("(//a[text()='Dresses'])[2]");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public DressesPage clickDresses(){
        driver.findElement(clickDresses).click();
        return new DressesPage(driver);
    }

}
