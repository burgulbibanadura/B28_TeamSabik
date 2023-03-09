package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US125_VehicleContractsPage {

    public US125_VehicleContractsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath ="//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement FleetModule;

    @FindBy (xpath="//span[.=\"Vehicle Contracts\"]")
    public WebElement VehicleContracts;

    @FindBy (xpath ="//div[.='You do not have permission to perform this action.']")
    public WebElement ErrorMessage;
}
