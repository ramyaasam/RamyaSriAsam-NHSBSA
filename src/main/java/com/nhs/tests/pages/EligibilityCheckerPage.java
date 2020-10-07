package com.nhs.tests.pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class EligibilityCheckerPage {

    private String baseURL="https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
    private String driversPath = "src/main/resources/drivers/";
    public static WebDriver driver;

    public void setCountryDetails(){
        driver.findElement(By.xpath("//input[@value='Start']")).click();
        setCountry();
    }

    public void enterEligibility(){
        setDoB();
        setLiveWithPartner();
        setTaxClaim();
        setUniversalCredit();
        setBenefits();
    }

    private void setCountry(){
        driver.findElement(By.cssSelector("#label-wales")).click();
        navigateToNextPage();
    }

    private void setDoB(){
        driver.findElement(By.cssSelector("#dob-day")).sendKeys("12");
        driver.findElement(By.cssSelector("#dob-month")).sendKeys("08");
        driver.findElement(By.cssSelector("#dob-year")).sendKeys("1990");
        navigateToNextPage();
    }

    private void setLabelYes(){
        driver.findElement(By.cssSelector("#label-yes")).click();
    }

    private void setLiveWithPartner(){
        setLabelYes();
        navigateToNextPage();
    }

    private void setTaxClaim(){
        setLabelYes();
        navigateToNextPage();
    }

    private void setUniversalCredit(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"different-benefit\"]")).click();
        navigateToNextPage();
    }

    private void setBenefits(){
        driver.findElement(By.cssSelector("#incSupport")).click();
        navigateToNextPage();
    }

    public void validateEligibility(){
        if(driver.findElement(By.xpath("//div[@class='done-panel']//h2")).isDisplayed()){
            System.out.println(driver.findElement(By.xpath("//div[@class='done-panel']//h2")).getText());
        }
    }

    private void navigateToNextPage(){
        driver.findElement(By.cssSelector("#next-button")).click();
    }


    @Before
    public void initialize(){
        if(System.getProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",driversPath+"chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver",driversPath+"geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @After
    public void quit(){
        driver.quit();
    }
}
