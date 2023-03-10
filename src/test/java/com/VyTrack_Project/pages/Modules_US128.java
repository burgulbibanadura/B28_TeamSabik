package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Modules_US128 {

    public Modules_US128(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css="span.title-level-1")
    public List<WebElement> menuOptions;


}
