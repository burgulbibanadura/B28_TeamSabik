package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US120_CalendarRepeatDayPage {

    public US120_CalendarRepeatDayPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement activitiesButtonManager;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesButtonDriver;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEventButton;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']" )
    public WebElement CreateCalendarEventButton;

    @FindBy(xpath = "//input[contains(@id,'oro_calendar_event_form_title')]")
    public WebElement title;

    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public  WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[contains(@class,'recurrence-subview-control__number')])[1]")
    public WebElement repeatEveryButton;

    @FindBy(xpath = "//span[text()='The value have not to be more than 99.']")
    public WebElement warningMessage99;

    @FindBy(xpath = "//span[text()='The value have not to be less than 1.']")
    public WebElement warningMessage1;

    @FindBy(xpath = "(//span[contains(.,'The value have not')])[3]")
    public WebElement warningMessageBoth;
}
