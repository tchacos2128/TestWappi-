#Author: tchacos2128@gmail.com
#language: en
Feature: Order
  As a user Wappi
  I want to ask for an order
  to I have it in my orders

  Scenario: Successful order
	Given I am authenticated in the app like "pepito123" and "pepito123"
	When I order "Pan tajado"
	Then I should see "Pan tajado" in my orders