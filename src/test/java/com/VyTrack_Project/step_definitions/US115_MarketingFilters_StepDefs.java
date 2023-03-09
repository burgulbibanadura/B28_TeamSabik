package com.VyTrack_Project.step_definitions;

import com.VyTrack_Project.pages.US115_MarketingCampaignsPage;
import com.VyTrack_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US115_MarketingFilters_StepDefs {

    US115_MarketingCampaignsPage us115_marketingCampaignsPage = new US115_MarketingCampaignsPage();

    @When("user clicks on Campaigns dropdown under Marketing module")
    public void user_clicks_on_campaigns_dropdown_under_marketing_module() {
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.hover(us115_marketingCampaignsPage.marketingModule);
        us115_marketingCampaignsPage.campaignsDropdown.click();

    }
    @When("user clicks on Manage filters button")
    public void user_clicks_on_manage_filters_button() {
        BrowserUtils.waitFor(3);
        us115_marketingCampaignsPage.filterButton.click();

        us115_marketingCampaignsPage.manageFiltersButton.click();

    }
    @Then("user should see five options checked by default")
    public void user_should_see_five_options_checked_by_default() {
        int checkedOptions = 0;
        for (WebElement each : us115_marketingCampaignsPage.filterOptions) {
            if (each.isSelected()){
                checkedOptions++;
            }
        }
        Assert.assertTrue( checkedOptions == 5);

    }

    @When("user unchecks the second and third checkboxes")
    public void user_unchecks_the_second_and_third_checkboxes() {

        us115_marketingCampaignsPage.firstCheckbox.click();

        us115_marketingCampaignsPage.thirdCheckbox.click();
    }
    @Then("user should see one or more options are unchecked")
    public void user_should_see_one_or_more_options_are_unchecked() {
        BrowserUtils.waitFor(3);

        Assert.assertTrue(!(us115_marketingCampaignsPage.firstCheckbox.isSelected()|| us115_marketingCampaignsPage.thirdCheckbox.isSelected()));
    }



}
