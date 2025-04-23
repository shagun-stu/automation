package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() throws Exception{
        System.out.println("Hi");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws Exception{
        System.out.println("user is on login page");
        // Add logic to enter username & password
    }

    @When("clicks on login button")
    public void clicks_on_login_button() throws Exception{
        // Click login
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page()throws Exception {
        // Validate home page
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() throws Exception{
        // Invalid credentials logic
    }

    @Then("error message is displayed - Invalid Credentials")
    public void error_message_is_displayed_Invalid_Credentials() throws Exception{
        // Validate error message
    }
}