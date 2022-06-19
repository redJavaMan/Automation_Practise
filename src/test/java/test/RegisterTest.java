package test;

import org.testng.annotations.Test;
import pages.*;

public class RegisterTest extends BaseTest{
@Test
    public void testSuccessfulRegister(){
    DressesPage dressesPage=homePage.clickDresses();
    PrintedDressPage printedDressPage=dressesPage.clickPrintedDress();
    printedDressPage.setQuantity("2");
    printedDressPage.selectSize("M");
    printedDressPage.AddToCart();
    OrderPage orderPage=printedDressPage.proceed2CheckOut();
    LoginPage loginPage=orderPage.proceedToCheckOutOrderPage();
    loginPage.createAccount("lukmanudhin0754@gmail.com");
    loginPage.selectGender();
    loginPage.enterFirstName("Mohammed");
    loginPage.enterLastName("Lukman");
    loginPage.enterPassword("123456789");
    loginPage.selectDay("15");
    loginPage.selectMonth("January ");
    loginPage.selectYear("2001");
    loginPage.enterCompany("HCL Technologies");
    loginPage.enterAddress("Dubai kuruku sandhu");
    loginPage.enterCity("Chennai");
    loginPage.selectState("New York");
    loginPage.enterPostalCode("60014");
    loginPage.enterPhoneNo("9965654587");
    AddressPage addressPage=loginPage.clickRegister();
}
}
