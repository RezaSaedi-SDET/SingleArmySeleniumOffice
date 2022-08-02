package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://syntaxprojects.com/dynamic-elements-loading.php";
        driver.get(url);

        WebElement startButton=driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Welcome Syntax Technologies']")));

        WebElement text=driver.findElement(By.xpath("//*[text()='Welcome Syntax Technologies']"));
        System.out.println(text.getText());


    }
}
