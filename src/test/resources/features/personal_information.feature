#Author: tchacos2128@gmail.com
#language: en
Feature: Personal Information
  As a user Wappi
  I want to update my personal data
  to I don't to have inconveniences when ordering

  Scenario: try to update personal data without the name
	Given I am authenticated in the app like "pepito123" and "pepito123"
	When I want to update my personal with Name  Last Name Perez Birth Date 15/09/2020 and Country
	Then wappi should tell me that El nombre es requerido

  Scenario: try to update personal data without the last name
	Given I am authenticated in the app like "pepito123" and "pepito123"
	When I want to update my personal with Name pepito Last Name  Birth Date 15/09/2020 and Country
	Then wappi should tell me that El apellido es requerido

  Scenario: try to update personal data without the Birth
	Given I am authenticated in the app like "pepito123" and "pepito123"
	When I want to update my personal with Name pepito Last Name Perez Birth Date  and Country
	Then wappi should tell me that La fecha de nacimiento es requerida

  Scenario: try to update personal data without the country
	Given I am authenticated in the app like "pepito123" and "pepito123"
	When I want to update my personal with Name pepito Last Name Perez Birth Date 15/09/2020 and withoutCountry
	Then wappi should tell me that El pais es requerido