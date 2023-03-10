package com.VyTrack_Project.step_definitions;


import com.VyTrack_Project.pages.PinBar;
import com.VyTrack_Project.pages.US126_Learn_HowToUse_PinbarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US126_Learn_HowToUse_Pinbar {

    US126_Learn_HowToUse_PinbarPage learn_howToUse_pinbarPage = new US126_Learn_HowToUse_PinbarPage();

    PinBar pinBar = new PinBar();



    US126_Learn_HowToUse_PinbarPage mainPage = new US126_Learn_HowToUse_PinbarPage();
    @Given("User click on Learn how to use this space link")
    public void user_click_on_learn_how_to_use_this_space_link() {
        mainPage.linkForLearnHowToUseThisSpace.click();

    }
    @Then("User should see how to use pinbar title")
    public void user_should_see_how_to_use_pinbar_title() {

        String expectedTitle = "How To Use Pinbar";
        String actualTitle = pinBar.pinbarMessage.getText();
        Assert.assertEquals(expectedTitle,actualTitle);

        String expectedTitle1 =  "Use the pin icon on the right top corner of the page to create fast access link in the pinbar.";
        String actualTitle1 = pinBar.usePinIconMessage.getText();
        Assert.assertEquals(expectedTitle1,actualTitle1);


    }
    @Then("user should see an image of pinbar on the page")
    public void user_should_see_an_image_of_pinbar_on_the_page() {

        Assert.assertTrue(pinBar.pinBar.isDisplayed());


    }



}
