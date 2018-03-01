
Feature: Test Cases for Table Task 41.
  All cases for Table Task 41 by Maksim Laitan

  Scenario: Import links from pages
    Given Open the Base page
    And Login to the page
    And Open TablePress page
    When Click top button Import
    And Click top button All Tables
    And Click top button Import
    And Click top button Add New
    And Click top button Import
    And Click top button Export
    #next part
    And Click top button Import
    And Click menu link All Tables
    And Click top button Import
    And Click menu link Add New Table
    And Click top button Import
    And Click menu link Export a Table
    #next part
    And Click top button Import
    And Click menu link All Tables
    And Click menu link Import a Table
    And Click menu link Add New Table
    And Click menu link Import a Table
    And Click menu link Export a Table
    #next part
    And Click menu link Import a Table
    And Click top button All Tables
    And Click menu link Import a Table
    And Click top button Add New
    And Click menu link Import a Table
    And Click top button Export
    Then Click menu link Import a Table

    @bash
  Scenario: Import file CSV from the computer - new table
    Given Open the Base page
    When Click menu link Import a Table
    And Click Import Choose File button


  @Task41
  Scenario: New
    Given Open the Base page
    And Login to the page
    And Open TablePress page
