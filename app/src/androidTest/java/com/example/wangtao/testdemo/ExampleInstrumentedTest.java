package com.example.wangtao.testdemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class) public class ExampleInstrumentedTest {
  @Test public void useAppContext() throws Exception {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    //capabilities.setCapability("deviceName", "SALDU17415000750");
    capabilities.setCapability("deviceName", "3895da04");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "5.1.1");
    capabilities.setCapability("appPackage", "com.android.calculator2");
    capabilities.setCapability("appActivity", ".Calculator");

    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    WebElement elementByName = driver.findElementById("com.android.calculator2:id/digit1");
    System.out.println("elementByName  "+elementByName);
    System.out.println("elementByName  "+elementByName.isDisplayed());
    elementByName.click();
    //
    //driver.findElement(By.name("1")).click();
    //driver.findElement(By.name("5")).click();
    //driver.findElement(By.name("9")).click();
    //driver.findElement(By.name("delete")).click();
    //driver.findElement(By.name("+")).click();
    //driver.findElement(By.name("6")).click();
    //driver.findElement(By.name("=")).click();
    Thread.sleep(2000);

    String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
    System.out.println(result);

    driver.quit();
  }
}
