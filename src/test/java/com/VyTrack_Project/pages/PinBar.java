package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinBar {

    public PinBar() {
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy (xpath = "//*[@id='container']/div[2]/div/p[2]/img")
    public WebElement pinBar;
    @FindBy(xpath = "//*[@id='container']/div[2]/div/h3")
    public WebElement pinbarMessage;
    @FindBy (xpath = "//*[@id='container']/div[2]/div/p[1]")
    public WebElement usePinIconMessage;




}

