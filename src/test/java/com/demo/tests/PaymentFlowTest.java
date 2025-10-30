package com.demo.tests;

import com.demo.base.TestBase;
import com.demo.pages.HomePage;
import com.demo.pages.PaymentPage;
import org.testng.annotations.Test;

public class PaymentFlowTest extends TestBase {

    @Test
    public void verifyPaymentFlowTillOtp() {
        // Initialize driver from TestBase
        setUp();

        // Step 1: Open the payment site
        HomePage home = new HomePage(driver);
        home.openApp();
        home.clickBuyNow();

        // Step 2: Enter payment details
        PaymentPage payment = new PaymentPage(driver);
        payment.enterCardDetails("1234567890123456", "10", "2025", "123");
        payment.clickPay();

        // Step 3: Teardown after test
        tearDown();
    }
}
