package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SkillfactoryTest {

    private static WebDriver webDriver;
    private static MainPage mainPage;
    private static InputPage inputPage;

    @Before
    public void init () {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\lksgo\\IdeaProjects\\Skillfactory\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        mainPage = new MainPage(webDriver);
        inputPage = new InputPage(webDriver);
    }
    @Test
    public void headerElementCoursesTest() {
        mainPage.mainUrl();
        mainPage.headerElementCourses();
    }
    @Test
    public void headerElementFreeEventsTest() {
        mainPage.mainUrl();
        mainPage.headerElementFreeEvents();
    }
    @Test
    public void headerElementCareerCenterTest() {
        mainPage.mainUrl();
        mainPage.headerElementCareerCenter();
    }
    @Test
    public void headerElementContactsTest() {
        mainPage.mainUrl();
        mainPage.headerElementContacts();
    }
    @Test
    public void inputNameTest(){
        mainPage.mainUrl();
        inputPage.inputName();
    }
    @Test
    public void inputNameEnterTest(){
        mainPage.mainUrl();
        inputPage.inputNameEnter();
        final var mameNotFoundMessage = inputPage.getNameNotFoundMessage();
        assertEquals("Пожалуйста, заполните все обязательные поля", mameNotFoundMessage);
    }
    @Test
    public void inputMailTest(){
        mainPage.mainUrl();
        inputPage.inputMail();
    }
    @Test
    public void inputMailEnterTest(){
        mainPage.mainUrl();
        inputPage.inputMailEnter();
        final var mailNotFoundMessage = inputPage.getMailNotFoundMessage();
        assertEquals("Укажите, пожалуйста, корректный email", mailNotFoundMessage);
    }
    @Test
    public void inputTelTest(){
        mainPage.mainUrl();
        inputPage.inputTel();
    }
    @Test
    public void inputNoTelTest(){
        mainPage.mainUrl();
        inputPage.inputNoTel();
    }
    @Test
    public void containerChatTest(){
        mainPage.mainUrl();
        mainPage.containerChat();
    }
    @Test
    public void elementTestTest() {
        mainPage.mainUrl();
        mainPage.elementTest();
    }
    @Test
    public void elementTestJavaTest() {
        mainPage.elementTestJava();
    }
    @Test
    public void elementCoursesJavaTest() {
        mainPage.elementCoursesJava();
    }
    @Test
    public void inputNameJavaTest(){
        mainPage.elementCoursesJava();
        inputPage.inputNameJava();
    }
    @Test
    public void inputNameJavaEnterTest(){
        mainPage.elementCoursesJava();
        inputPage.inputNameJavaEnter();
        final var mameJavaNotFoundMessage = inputPage.getNameJavaNotFoundMessage();
        assertEquals("Пожалуйста, заполните все обязательные поля", mameJavaNotFoundMessage);
    }
    @Test
    public void inputMailJavaTest(){
        mainPage.elementCoursesJava();
        inputPage.inputMailJava();
    }
    @Test
    public void inputMailJavaEnterTest(){
        mainPage.elementCoursesJava();
        inputPage.inputMailJavaEnter();
        final var mailJavaNotFoundMessage = inputPage.getMailJavaNotFoundMessage();
        assertEquals("Укажите, пожалуйста, корректный email", mailJavaNotFoundMessage);
    }
    @Test
    public void inputTelJavaTest(){
        mainPage.elementCoursesJava();
        inputPage.inputTelJava();
    }
    @Test
    public void inputNoTelJavaTest(){
        mainPage.elementCoursesJava();
        inputPage.inputNoTelJava();
    }

    @After
    public void finalizeResources() {
        webDriver.close();

    }
}
