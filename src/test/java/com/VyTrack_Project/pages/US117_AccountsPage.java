package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US117_AccountsPage extends BasePage {

    public US117_AccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Accounts']")
    public WebElement accountsOption;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersDropdown;

    @FindBy(xpath = "//label[contains(@for, 'ui')]")
    public List<WebElement> manageFiltersOptions;

    @FindBy(css = ".fa-filter.hide-text")
    public WebElement funnelButton;





}

