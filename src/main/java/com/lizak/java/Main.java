package com.lizak.java;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.sql.Driver;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.ById.id("lst-ib"));
        element.sendKeys("hfhdjdhfhh");
        element.sendKeys(Keys.ENTER);


    }
}
