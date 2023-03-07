package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage {

    public VehicleCostsPage(){
    PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//table/thead)[1]/tr/th/a/span[@class='grid-header-cell__label']")
    public List<WebElement> tableColumnHeaders;

    @FindBy(xpath = "(//table/thead)[1]/tr/th/a/span[.='Type']")
    public WebElement typeColumnHeader;

    @FindBy(xpath = "(//table/thead)[1]/tr/th/a/span[.='Total Price']")
    public WebElement totalPriceColumnHeader;

    @FindBy(xpath = "(//table/thead)[1]/tr/th/a/span[.='Date']")
    public WebElement dateColumnHeader;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[2]")
    public WebElement firstCheckBoxButton;
}
