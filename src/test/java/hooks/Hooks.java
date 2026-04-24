package hooks;

import configs.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver webdriver;


    @Before

    public void setup(){
        webdriver = DriverFactory.initBrowser("chrome");
        webdriver.manage().window().maximize();
        webdriver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown(){

        DriverFactory.quitDriver();

    }












}
