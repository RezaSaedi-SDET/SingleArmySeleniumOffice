package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement ageRadioButton=driver.findElement(By.cssSelector("input[value='5 - 15']"));
        boolean isAgeRadioButtonEnabled= ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);
        boolean isAgeRadioButtonDisplayed= ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);
        boolean isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println("Before Clicking "+isAgeRadioButtonSelected);
        ageRadioButton.click();
        isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println("After Clicking "+isAgeRadioButtonSelected);


    }
}
