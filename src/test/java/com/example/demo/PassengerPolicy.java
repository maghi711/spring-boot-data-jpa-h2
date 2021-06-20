package com.example.demo;

/*
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
*/
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassengerPolicy {
    private List<String> passengers = new ArrayList<>();
    private Map<String, List<String>> flightWIthPassengers = new HashMap<>();
    private String passenger = null;
/*
    @Given("^there is an economy flight$")
    public void thereIsAnEconomyFlight() throws Throwable {
        flightWIthPassengers.put("AirIndia", passengers);
    }

    @When("^we have a usual passenger$")
    public void weHaveAUsualPassenger() {
        passenger = "Aadavan";
        passengers.add(passenger);
    }

    @Then("^you can add and remove him from an economy flight$")
    public void youCanAddAndRemoveHimFromAnEconomyFlight() {
        List<String> airIndia = flightWIthPassengers.get("AirIndia");
        //airIndia.get(0)
        Assertions.assertAll("Verifying all",
                () -> Assert.assertEquals(1, airIndia.size()),
                () -> Assert.assertEquals("Aadavan", airIndia.get(0)),
                () -> Assert.assertEquals("Aadavan", airIndia.remove(0)),
                () -> Assert.assertEquals(0, airIndia.size())
                );
    }
 */
}
