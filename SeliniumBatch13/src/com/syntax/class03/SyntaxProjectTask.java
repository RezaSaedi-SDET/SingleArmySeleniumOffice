package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class SyntaxProjectTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement startPracticingButton=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        WebElement enterMessage=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("Don't give up");
        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();

    }
}
