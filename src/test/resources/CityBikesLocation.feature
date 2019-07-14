@Functional
Feature: As a bike customer I would like to know the exact location of city bikes around the world

  Background: Request sent to City Bike API
  When GET request is sent to the City Bike API

  Scenario: Check if the response is received successfully from City Bike API
    Then service should return 200 response

  Scenario: Extract the list of Cities from City Bike API
    Then all the country codes should be extracted

  Scenario: Verify if the given city is in a given country
    Then I want to verify if the city "Frankfurt" is in Germany "DE"
