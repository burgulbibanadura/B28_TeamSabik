package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US126_Learn_HowToUse_PinbarPage {

    public US126_Learn_HowToUse_PinbarPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Learn how to use this space")
    public WebElement linkForLearnHowToUseThisSpace;












}
