package Sensyne_StepDef;

import Sensyne.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Stepdefs {
    getProduct getProduct =new getProduct();
    getProducts getProducts =new getProducts();
    createProduct createProduct =new createProduct();
    deleteProduct deleteProduct =new deleteProduct();
    updateProduct updateProduct =new updateProduct();

    @When("GET request is sent to get Sensyne Product API for product {string}")
    public void getRequestIsSentToGetSensyneProductAPIForProduct(String arg0) {
        getProduct.sendRequest(arg0);
    }

    @Then("getProduct service should return {int} response")
    public void serviceShouldReturnResponse(int arg0) {
        Assert.assertEquals(getProduct.validateResponse(),arg0);
    }

    @And("getProduct response should return only json format")
    public void responseShouldReturnOnlyJsonFormat() {
Assert.assertTrue(getProduct.validateJson());
    }


    @And("the response should validate against ProductJSON")
    public void theResponseShouldValidateAgainstProductJSON(String schema) {
    getProduct.validateJsonFormat(schema);
    }

    @When("GET request is sent to get Sensyne Products API for all product")
    public void getRequestIsSentToGetSensyneProductAPIForAllProduct() {
        getProducts.sendRequest();
    }

    @Then("getProducts service should return {int} response")
    public void getproductsServiceShouldReturnResponse(int arg0) {
        Assert.assertEquals(getProducts.validateResponse(),arg0);
    }

    @And("getProducts response should return only json format")
    public void getproductsResponseShouldReturnOnlyJsonFormat() {
        Assert.assertTrue(getProducts.validateJson());
    }

    @When("POST request is sent to create Sensyne Product API for product {string}, name {string} and price {string}")
    public void postRequestIsSentToCreateSensyneProductAPIForProductNameAndPrice(String arg0, String arg1, String arg2) {
        createProduct.sendRequest(arg0,arg1,arg2);
    }

    @Then("createProduct service should return {int} response")
    public void createproductServiceShouldReturnResponse(int arg0) {
        createProduct.validateResponse();
    }

    @When("GET request is sent to delete Sensyne Product API for product {string}")
    public void getRequestIsSentToDeleteSensyneProductAPIForProduct(String arg0) {
        deleteProduct.sendRequest(arg0);
    }

    @Then("deleteProduct service should return {int} response")
    public void deleteproductServiceShouldReturnResponse(int arg0) {
        deleteProduct.validateResponse();
    }

    @When("PUT request is sent to create Sensyne Product API for product {string}, name {string} and price {string}")
    public void putRequestIsSentToCreateSensyneProductAPIForProductNameAndPrice(String arg0, String arg1, String arg2) {
    updateProduct.sendRequest(arg0,arg1,arg2);
    }

    @Then("updateProduct service should return {int} response")
    public void updateproductServiceShouldReturnResponse(int arg0) {
        updateProduct.validateResponse();
    }

}
