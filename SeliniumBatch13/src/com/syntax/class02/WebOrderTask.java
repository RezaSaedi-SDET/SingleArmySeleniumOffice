package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement  username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("tester");;
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement button=driver.findElement(By.className("button"));
        button.click();
        String title=driver.getTitle();
        String expectedTitle="Web Orders Login";
        if (title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }
        driver.findElement(By.linkText("Logout")).click();
    }
}
