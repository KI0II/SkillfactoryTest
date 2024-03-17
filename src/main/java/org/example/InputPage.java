package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public record InputPage(WebDriver webDriver) {

    public void inputName(){
        webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[1]/div/input"));
        final var searchInput = webDriver.findElement(
                By.xpath("//*[@id=\"form625408054\"]/div[2]/div[1]/div/input"));
        searchInput.sendKeys("Алексей", Keys.END);
    }
    public void inputNameEnter() {
        webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[1]/div/input"));
        final var searchInput = webDriver.findElement(
                By.xpath("//*[@id=\"form625408054\"]/div[2]/div[1]/div/input"));
        searchInput.sendKeys("Алексей", Keys.ENTER);
    }
    public String getNameNotFoundMessage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p"))).getText();
        return webDriver.findElement(By.xpath(
                "//*[@id=\"tilda-popup-for-error\"]/div[1]/p")).getText();
    }
    public void inputMail(){
        webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[2]/div/input"));
        final var searchInput = webDriver.findElement(
                By.xpath("//*[@id=\"form625408054\"]/div[2]/div[2]/div/input"));
        searchInput.sendKeys("mail@mail.ru", Keys.END);
    }
    public void inputMailEnter(){
        webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[2]/div/input"));
        final var searchInput = webDriver.findElement(
                By.xpath("//*[@id=\"form625408054\"]/div[2]/div[2]/div/input"));
        searchInput.sendKeys("mailmail.ru", Keys.ENTER);
    }
    public String getMailNotFoundMessage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p[2]"))).getText();
        return webDriver.findElement(By.xpath(
                "//*[@id=\"tilda-popup-for-error\"]/div[1]/p[2]")).getText();
    }
    public void inputTel(){
        webDriver.findElement(By.id("input_1676828667932"));
        final var searchInput = webDriver.findElement(By.id("input_1676828667932"));
        searchInput.sendKeys("1234567890", Keys.END);
    }
    public void inputNoTel(){
        webDriver.findElement(By.id("input_1676828667932"));
        final var searchInput = webDriver.findElement(By.id("input_1676828667932"));
        searchInput.sendKeys("12345678901", Keys.END);
    }
    public void inputNameJava(){
        webDriver.findElement(By.id("input_1495810359387"));
        final var searchInput = webDriver.findElement(By.id("input_1495810359387"));
        searchInput.sendKeys("Голубев Алексей", Keys.END);
    }
    public void inputNameJavaEnter(){
        webDriver.findElement(By.id("input_1495810359387"));
        final var searchInput = webDriver.findElement(By.id("input_1495810359387"));
        searchInput.sendKeys("Голубев Алексей", Keys.ENTER);
    }
    public String getNameJavaNotFoundMessage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"form581372890\"]/div[2]/div[6]/div/ul/li[2]/a"))).getText();
        return webDriver.findElement(By.xpath(
                "//*[@id=\"form581372890\"]/div[2]/div[6]/div/ul/li[2]/a")).getText();
    }
    public void inputMailJava(){
        webDriver.findElement(By.id("input_1495810354468"));
        final var searchInput = webDriver.findElement(By.id("input_1495810354468"));
        searchInput.sendKeys("mail@mail.ru", Keys.END);
    }
    public void inputMailJavaEnter(){
        webDriver.findElement(By.id("input_1495810354468"));
        final var searchInput = webDriver.findElement(By.id("input_1495810354468"));
        searchInput.sendKeys("mailmail.ru", Keys.ENTER);
    }
    public String getMailJavaNotFoundMessage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"form581372890\"]/div[2]/div[6]/div/ul/li[3]/a"))).getText();
        return webDriver.findElement(By.xpath(
                "//*[@id=\"form581372890\"]/div[2]/div[6]/div/ul/li[3]/a")).getText();
    }
    public void inputTelJava(){
        webDriver.findElement(By.id("input_1495810410810"));
        final var searchInput = webDriver.findElement(By.id("input_1495810410810"));
        searchInput.sendKeys("1234567890", Keys.END);
    }
    public void inputNoTelJava(){
        webDriver.findElement(By.id("input_1495810410810"));
        final var searchInput = webDriver.findElement(By.id("input_1495810410810"));
        searchInput.sendKeys("12345678901", Keys.END);
    }
}
