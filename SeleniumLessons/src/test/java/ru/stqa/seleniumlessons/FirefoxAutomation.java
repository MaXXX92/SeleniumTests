package ru.stqa.seleniumlessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    Thread.sleep(3000);
    driver.quit();
  }
}
