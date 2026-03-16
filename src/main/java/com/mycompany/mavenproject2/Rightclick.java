package com.mycompany.mavenproject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class Rightclick
{
    void done() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = driver.findElement(By.id("hot-spot"));

        Actions action = new Actions(driver);
        action.contextClick(box).perform();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(" The alert Message is :"+text);
        alert.accept();

        driver.quit();
    }

    public static void main(String[] args)
    {
        Rightclick mg = new Rightclick();
        mg.done();
    }
}