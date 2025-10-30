package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestBase {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Start the browser before each test class
        driver = DriverFactory.initDriver();
    }

    @AfterClass
    public void tearDown() {
        // Quit the browser after tests complete
        DriverFactory.quitDriver();
    }
}
