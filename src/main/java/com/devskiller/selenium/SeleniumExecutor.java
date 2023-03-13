package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExecutor {

  private final WebDriver driver;
  public String extractHeaderText(WebDriver driver) {
    WebElement containerDiv = driver.findElement(By.className("container"));
    WebElement header = containerDiv.findElement(By.tagName("h1"));
    return header.getText();
  }
  public String extractLinkUrl(WebDriver driver) {
    WebElement clickMeButton = driver.findElement(By.id("click-me-button"));
    clickMeButton.click();
    WebElement newLink = driver.findElement(By.tagName("a"));
    return newLink.getAttribute("href");
  }

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  public String extractHeader() {
    return null;
  }

  public String clickTheButtonAndExtractLink() {
    return null;
  }

}
