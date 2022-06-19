package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DressesPage {
    private WebDriver driver;
    private By clickPrintedDress = By.xpath("(//h5[@itemprop=\"name\"]//a[contains(.,\"Printed Dress\")])[2]");

    public DressesPage(WebDriver driver) {
        this.driver=driver;
    }
public PrintedDressPage clickPrintedDress(){
        driver.findElement(clickPrintedDress).click();
        return new PrintedDressPage(driver);
}

}
