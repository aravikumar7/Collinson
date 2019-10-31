@CreateProduct
Feature: As a Sensyne API user, I would like to create a product for Sensyne

  Scenario: Validate product price service responds with 200 message code for a valid request
    When POST request is sent to create Sensyne Product API for product "51", name "V Neck T-Shirt" and price "5.60"
    Then createProduct service should return 200 response

  Scenario: Validate product price service responds with 000 message code for a valid request
    When POST request is sent to create Sensyne Product API for product "testproduct", name "V Neck T-Shirt" and price "testprice"
    Then createProduct service should return 000 response