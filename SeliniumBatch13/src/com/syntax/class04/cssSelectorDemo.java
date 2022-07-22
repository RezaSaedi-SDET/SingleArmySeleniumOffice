package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement startPracticing=driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticing.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder^='Please']"));
        textBox.sendKeys("SDET is wonderful");
        WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick*='showInput']"));
        showMessageButton.click();
        driver.quit();



    }
}
