package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US115_MarketingCampaignsPage extends BasePage {

    public US115_MarketingCampaignsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Campaigns'])[1]")
    public WebElement campaignsDropdown;

    @FindBy(css = "a[title='Filters']")
    public WebElement filterButton;

    @FindBy(xpath = "//a[.='Manage filters']")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//input[contains(@id, 'ui-multiselect')]")
    public List<WebElement> filterOptions;

    @FindBy(xpath = "(//input[contains(@id, 'ui-multiselect')])[1]")
    public WebElement firstCheckbox;

    @FindBy(xpath = "(//input[contains(@id, 'ui-multiselect')])[3]")
    public WebElement thirdCheckbox;







}
