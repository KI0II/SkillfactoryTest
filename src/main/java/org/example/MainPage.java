package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private final WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void mainUrl() {
        webDriver.navigate().to("https://skillfactory.ru/");
    }
    public void headerElementCourses(){
        webDriver.findElement(By.xpath("//a[@href='/courses']")).click();
    }
    public void headerElementFreeEvents(){
        webDriver.findElement(By.xpath("//a[@href='/free-events']")).click();
    }
    public void headerElementCareerCenter(){
        webDriver.findElement(By.xpath("//a[@href='/career-center']")).click();
    }
    public void headerElementContacts(){
        webDriver.findElement(By.xpath("//a[@href='/contacts']")).click();
    }
    public void containerChat(){
        webDriver.findElement(By.id("chat-container")).click();
    }
    public void elementTest(){
        webDriver.findElement(By.xpath("//a[@href='/courses/testirovanie']")).click();
    }
    public void elementTestJava(){
        webDriver.navigate().to("https://skillfactory.ru/courses/testirovanie");
        webDriver.findElement(By.xpath("//*[@id=\"QAJA\"]/div")).click();
    }
    public void elementCoursesJava() {
        webDriver.navigate().to("https://skillfactory.ru/java-qa-engineer-testirovshik-po");
        webDriver.findElement(By.className("tn-elem__3596564571596261549401")).click();
    }
}
