package com.sample.oops;

import com.sample.accessmodifiers.ProtectedAccessmodifier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubtractionDemo extends ProtectedAccessmodifier {

    public static void main(String[] args) {
        SubtractionDemo sub = new SubtractionDemo();
        sub.a = 10;
        sub.b = 10;
        sub.addition();
        sub.printResult();
    }

    @Given("I open google")
    public void i_open_google() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter {string} in search textbox")
    public void i_enter_in_search_textbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should get result as {string}")
    public void i_should_get_result_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
