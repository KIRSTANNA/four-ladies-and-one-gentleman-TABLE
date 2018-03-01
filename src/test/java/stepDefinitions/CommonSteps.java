package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommonSteps {
    private WebDriver driver;

    public CommonSteps() {
        this.driver = Hooks.driver;
    }


    @Given("^Open the Base page$")
    public void openTheBasePage() throws Throwable {
        // Open the base page "http://192.168.8.144/wordpress/wp-login"
        driver.get("http://192.168.8.144/wordpress/wp-login");
        assertEquals("http://192.168.8.144/wordpress/wp-login", driver.getCurrentUrl());
    }

    @And("^Login to the page$")
    public void loginToThePage() throws Throwable {
        // Enter user name "user" and password "admin1234" to access
        String userName = "user";
        String password = "admin1234";
        driver.findElement(By.id("user_login")).sendKeys(userName);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("wp-submit")).click();
    }

    @And("^Open TablePress page$")
    public void openTablePressPage() throws Throwable {
        // Open page for testing TABLE task
        driver.findElement(By.cssSelector("#toplevel_page_tablepress > a > div.wp-menu-name")).click();
        assertEquals("TablePress", driver.findElement(By.cssSelector("#tablepress-nav > .wp-heading-inline")).getText());
    }

    @When("^Click top button Import$")
    public void clickTopButtonImport() throws Throwable {

        driver.findElement(By.cssSelector("a[href='http://192.168.8.144/wordpress/wp-admin/admin.php?page=tablepress_import']")).click();
        assertEquals("Import Source:", driver.findElement(By.id("row-import-source")).getText());
    }

    @And("^Click top button All Tables$")
    public void clickTopButtonAllTables() throws Throwable {

        driver.findElement(By.cssSelector("a[href='http://192.168.8.144/wordpress/wp-admin/admin.php?page=tablepress']")).click();
        assertEquals("Search Tables", driver.findElement(By.id("search-submit")).getAttribute("value"));
    }
}
