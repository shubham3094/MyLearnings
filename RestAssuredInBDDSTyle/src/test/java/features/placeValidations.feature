Feature: Validating Place API's

Scenario: Verify if place is successfully added using AddPlaceApi
		Given Add Place Payload
		When user calls "AddPlaceApi" with Post http request
		Then the response in Api call got sucess with status code 200
		And "status" in response body is "OK"
		And "scope" in response body is "APP"