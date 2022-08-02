package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://uitestpractice.com/Students/Switchto";
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.id("name"));
        textBox.sendKeys("Batch 13 forever!!!");
        driver.switchTo().defaultContent();

        WebElement alertButton=driver.findElement(By.id("alert"));
        alertButton.click();
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();

    }
}
