package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MaksimLaitanTask41Steps {
    private WebDriver driver;

    public MaksimLaitanTask41Steps() {
        this.driver = Hooks.driver;
    }


    @And("^I see you$")
    public void iSeeYou() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/test-sample");
    }

}
