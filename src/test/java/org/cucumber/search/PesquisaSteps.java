package org.cucumber.search;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.search.HomePage;
import page.search.SearchPage;

import static org.junit.Assert.assertEquals;

public class PesquisaSteps {

    @Given("^that I have gone to the Google page$")
    public void I_have_gone_to_the_Google_page() {
        new HomePage().goTo();
    }

    @When("I add {string} to the org.cucumber.base.search box")
    public void I_add_to_the_search_box(String text) {
        new HomePage().pesquisar(text);
    }

    @And("^click the Search Button$")
    public void click_the_Search_Button() {
        new HomePage().click();
    }

    @Then("{string} should be mentioned in the first result")
    public void should_be_mentioned_in_the_first_result(String string) {
        assertEquals(string, new SearchPage().pegarTextoPrimeiroResultado());
    }

}
