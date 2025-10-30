package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // Locators
    private By buyNowButton = By.xpath("//input[@value='Buy Now']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Open the demo payment site
    public void openApp() {
        driver.get("https://demo.guru99.com/payment-gateway/index.php");
    }

    // Click on “Buy Now”
    public void clickBuyNow() {
        driver.findElement(buyNowButton).click();
    }
}
