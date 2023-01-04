package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class Selenium1 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Selenium1.class.getName());

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ExequielVR06\\Code\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.cl");

        logger.info(driver.getTitle());
        logger.info(driver.getCurrentUrl());


        driver.close();
    }
}
