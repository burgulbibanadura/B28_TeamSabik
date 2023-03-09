package com.VyTrack_Project.pages;

import com.VyTrack_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US119_writeTheDescription {

    public US119_writeTheDescription(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activitiesModule;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Calendar Events']")
    public WebElement calendarDropDown;


    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[title]']")
    public WebElement inputTitleBox;

    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(tagName = "p")
    public WebElement textBox;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement radioButton;


    @FindBy (xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[.='Scrum daily meeting']")
    public WebElement messageText;





}
