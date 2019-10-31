@GetProduct
Feature: As a Sensyne API user, I would like to get a product for Sensyne

  Scenario Outline: Validate product price service responds with 200 message code for a valid request
    When GET request is sent to get Sensyne Product API for product "1"
    Then getProduct service should return 200 response
    And getProduct response should return only json format
    And the response should validate against ProductJSON
  """
 {
  "$schema": "http://json-schema.org/draft-04/schema#",
  "type": "object",
  "properties": {
    "id": {
      "type": "integer"
    },
    "name": {
      "type": "string"
    },
    "price": {
      "type": "string"
    }
  },
  "required": [
    "id",
    "name",
    "price"
  ]
}
    """

    Examples:
      | product |
      | 1       |

  Scenario: Validate product price service  responds with 404 message code when there is no matching product
    When GET request is sent to get Sensyne Product API for product "100"
    Then getProduct service should return 404 response