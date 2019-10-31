@GetProducts
Feature: As a Sensyne API user, I would like to get all products for Sensyne

  Background: Request sent to get Products API
  When GET request is sent to get Sensyne Products API for all product

  Scenario: Validate product price service responds with 200 message code for a valid request
    Then getProducts service should return 200 response
    And getProducts response should return only json format

  Scenario: Validate product price service  responds with 404 message code when there is no product
    Then getProducts service should return 404 response