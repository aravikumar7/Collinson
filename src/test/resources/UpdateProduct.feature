@UpdateProduct
Feature: As a Sensyne API user, I would like to update a product detail for Sensyne

  Scenario: Validate product price service responds with 200 message code for a valid PUT request
    When PUT request is sent to create Sensyne Product API for product "10", name "U Neck T-Shirt" and price "5.66"
    Then updateProduct service should return 200 response

  Scenario: Validate product price service responds with 404 message code for a valid PUT request
    When PUT request is sent to create Sensyne Product API for product "500", name "U Neck T-Shirt" and price "5.66"
    Then updateProduct service should return 404 response