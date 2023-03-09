package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/calendar/event/create'])[3]")
    public WebElement createCalenderEventButton;

    @FindBy(xpath ="(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInputBox;

    @FindBy(xpath = "//span[@id='temp-validation-name-150-error']")
    public WebElement errorMessage;

    /*
    @FindBy(xpath = "(//span[text()='This value should not be blank.'])[2]")
    public WebElement errorMess

    */
}
