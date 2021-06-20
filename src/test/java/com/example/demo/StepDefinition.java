package com.example.demo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class StepDefinition {

    @LocalServerPort
    private int port;

    private RestTemplate restTemplate = new RestTemplate();

    private String baseUrl = "http://localhost";

    private String name = null;

    @Given("I can create a new post")
    public void i_can_create_a_new_post() {
        String url = baseUrl + ":" + port + "/apple/all";
        List<String> allPost = restTemplate.getForObject(url, List.class);
        System.out.println("Restponse from the URL " + allPost);
        assert allPost != null;
        Assert.assertFalse("should be true", allPost.isEmpty());
    }

    @When("^I send the post to be created with post id (.*), title (.*) and content (.*)$")
    public void i_send_the_post_to_be_created_with_post_id_title_New_post_title_and_content_new_post_content(String id,
                                                                     String title, String content) {
        String url = baseUrl + ":" + port + "/apple";
        String request = id + "_" + title + "_" + content;
        System.out.println("All the request variables" + request);
        String newName = restTemplate.postForObject(url, request, String.class);
        System.out.println("newName = " + newName);
        this.name = newName;
        Assert.assertNotNull(newName);
    }

    @Then("I should be able to see my newly created post")
    public void i_should_be_able_to_see_my_newly_created_post() {
        String url = baseUrl + ":" + port + "/apple/" + this.name;
        String gotName = restTemplate.getForObject(url, String.class);
        System.out.println("Got name: " + gotName);
        Assert.assertNotNull(gotName);
    }
}
