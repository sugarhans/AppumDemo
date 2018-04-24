package com.example.appiumlibrary;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by wangtao on 2018/4/23.
 */

public class CalculatorTest {


  public static void main(String[] args) throws MalformedURLException, InterruptedException {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    //capabilities.setCapability("deviceName", "SALDU17415000750");
    capabilities.setCapability("deviceName", "SALDU17415000750");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "8.0.0");
    capabilities.setCapability("appPackage", "com.android.calculator2");
    capabilities.setCapability("appActivity", ".Calculator");

    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    //WebElement elementByName = driver.findElementById("com.android.calculator2:id/digit1");
    //System.out.println("elementByName  "+elementByName);
    //System.out.println("elementByName  "+elementByName.isDisplayed());
    //elementByName.click();
    //
    driver.findElement(By.name("1")).click();
    driver.findElement(By.name("5")).click();
    driver.findElement(By.name("9")).click();
    //driver.findElement(By.name("delete")).click();
    driver.findElement(By.id("com.android.calculator2:id/del")).click();
    driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
    driver.findElement(By.name("6")).click();
    driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    Thread.sleep(2000);

    String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
    System.out.println(result);

    driver.quit();
  }


}
