package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String url="https://www.facebook.com";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement createNewAccountButton=driver.findElement(By.linkText("Create new account"));
        createNewAccountButton.click();
        Thread.sleep(2000);
        WebElement monthDD=driver.findElement(By.name("birthday_month"));
        Select select=new Select(monthDD);
        List<WebElement> allOptions=select.getOptions();
        int size=allOptions.size();
        System.out.println(size);

        for (int i=0;i<size;i++){
            String option=allOptions.get(i).getText();
            System.out.println(option);
        }
        select.selectByIndex(5);

       WebElement dayDD=driver.findElement(By.id("day"));
        dayDD.click();
        Select select2=new Select(dayDD);
        boolean isMultiple=select2.isMultiple();
        System.out.println(isMultiple);
        List<WebElement> allOptions2=select2.getOptions();
        int size2=allOptions2.size();
        System.out.println(size2);

        for (int i=0;i<size2;i++){
            String option=allOptions2.get(i).getText();
            System.out.println(option);
        }

        WebElement yearDD=driver.findElement(By.name("birthday_year"));
        Select select3=new Select(yearDD);
        List<WebElement> options3=select3.getOptions();
        int size3=options3.size();
        System.out.println(size3);

        for (int i=0;i<size3;i++){
            String option=options3.get(i).getText();
            System.out.println(option);
        }

        select.selectByIndex(0);
        select2.selectByIndex(0);
        select3.selectByValue("1985");

        driver.quit();











    }
}
