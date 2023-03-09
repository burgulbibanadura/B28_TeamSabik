package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US122_VehicleSelection_Page {

    public US122_VehicleSelection_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[contains(text(), 'Fleet')]")
    public WebElement fleetDropDown;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicleOption;

    @FindBy(xpath = "//div[@id='container']//table/thead/tr/th[1]/div/button/input")
    public WebElement mainCheckBox;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/input")
    public WebElement checkBox1;

    @FindBy(xpath = "//tbody/tr[6]/td[1]/input")
    public WebElement checkBox2;


}
