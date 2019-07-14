package Collinson_StepDef;

import Collinson.CityBike;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Stepdefs {
    CityBike cityBike=new CityBike();
    @When("GET request is sent to the City Bike API")
    public void getRequestIsSentToWith() {
        cityBike.sendRequest();
    }

    @Then("service should return {int} response")
    public void serviceShouldReturnResponse(int arg0) {
        Assert.assertEquals(cityBike.validateResponse(),200);
    }

    @Then("all the country codes should be extracted")
    public void allTheCountryCodesShouldBeExtracted() {
    cityBike.requestCountry();
    }

    @Then("I want to verify if the city {string} is in Germany {string}")
    public void iWantToVerifyIfTheCityIsInGermany(String arg0, String arg1) {
        Assert.assertEquals(cityBike.verifyCity(arg0),arg1);
        ;
    }
}
