package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.MainPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import com.VyTrack_Project.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US127_OroDoc_StepDefs {
    MainPage mainPage = new MainPage();
    @Then("user click the question icon on the right top of the homepage")
    public void user_click_the_question_icon_on_the_right_top_of_the_homepage() {
        BrowserUtils.waitFor(4);
        mainPage.getHelpButton.click();
    }
    @Then("User access to the Oro Documentation page")
    public void user_access_to_the_oro_documentation_page() {
        String homePageWindowHandle= Driver.getDriver().getWindowHandle();
        String oroDocWindowHandle;
        for (String eachWindowHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(eachWindowHandle);
            if(Driver.getDriver().getCurrentUrl().contains("oroinc")){
               oroDocWindowHandle= Driver.getDriver().getWindowHandle();
               break;
            }
        }
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Oro Documentation"));
        Driver.getDriver().switchTo().window(homePageWindowHandle);

    }


}
