package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.Modules_US128;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class mainModules_US128 {

    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> expectedOptions) {

        Modules_US128 modulesPage = new Modules_US128();
        List<WebElement> actualOptions = modulesPage.menuOptions;

        // Assertion to compare expected and actual options
        for (int i = 0; i < expectedOptions.size(); i++) {
            String expectedOption = expectedOptions.get(i);
            String actualOption = actualOptions.get(i).getText();
            assertEquals(expectedOption, actualOption);
        }

    }

}



