package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    private WebDriver driver;

    // Locators for card fields and Pay button
    private By cardNumber = By.name("card_nmuber");
    private By expMonth = By.id("month");
    private By expYear = By.id("year");
    private By cvvCode = By.id("cvv_code");
    private By payButton = By.name("submit");

    // Constructor
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Fill in card details
    public void enterCardDetails(String number, String month, String year, String cvv) {
        driver.findElement(cardNumber).sendKeys(number);
        driver.findElement(expMonth).sendKeys(month);
        driver.findElement(expYear).sendKeys(year);
        driver.findElement(cvvCode).sendKeys(cvv);
    }

    // Click Pay button
    public void clickPay() {
        driver.findElement(payButton).click();
    }
}
