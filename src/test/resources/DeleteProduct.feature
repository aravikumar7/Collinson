@DeleteProduct
Feature: As a Sensyne API user, I would like to delete a product for Sensyne

  Background: Request sent to delete Product API
  When GET request is sent to delete Sensyne Product API for product "11"

  Scenario: Validate product price service responds with 200 message code for a valid request
    Then deleteProduct service should return 200 response

  Scenario: Validate product price service  responds with 404 message code when there is no product
    Then deleteProduct service should return 404 response