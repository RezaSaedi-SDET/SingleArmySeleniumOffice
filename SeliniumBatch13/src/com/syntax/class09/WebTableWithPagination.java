package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTableWithPagination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://syntaxprojects.com/table-pagination-demo.php";
        driver.get(url);

        List<WebElement> rows=driver.findElements(By.xpath("//tbody[@id='myTable']/tr"));
        WebElement nextButton=driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean flag = true;

        while(flag){
            for(WebElement row:rows){
                String rowText=row.getText();
                if(rowText.contains("Archy J")){
                    flag=false;
                    System.out.println(rowText);
                    break;
                }
            }
            nextButton.click();
        }



    }
}
