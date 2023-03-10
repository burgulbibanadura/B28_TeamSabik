package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US124_VehicleModulePage {


    public US124_VehicleModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//span[contains(text(), 'Fleet')])[1]")
    public WebElement fleetDropDown;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicleOption;

@FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Vehicles Model']")
public WebElement vehicleModule;

    @FindBy(css = "span.grid-header-cell__label")
    public List<WebElement> tableColumnHeaders;

    @FindBy(xpath = "(//*[@id='flash-messages']/div/div/div/div)[2]")
    public WebElement errorMessageDisplayed;
}
