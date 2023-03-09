package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetDropdown;

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[2]")
    public WebElement customersDropdown;

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[3]")
    public WebElement activitiesDropdown;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCostsTabUnderFleet;

    @FindBy(xpath = "//i[@title='Get help']")
    public WebElement getHelpButton;



}
