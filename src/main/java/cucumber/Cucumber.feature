#Author: sakthivel.ts.9292@gmail.com
Feature: Web Service Automation by Selenium
  Amazon Web Automation

  @PaperBook
  Scenario Outline: Reading the specification for PaperBook
    Given I want to navigate to website <url>
    When I Search for <Keyword> under <category> in Departments
    And I need to view the result number <searchResult>
    Then I need to see some of the details for <booktype> Books

    Examples: 
      | url            | Keyword | category | searchResult | booktype |
      | "www.amazon.com" | "data"    | "Books"    |            1 | "Used"     |
      | "www.amazon.com" | "data"    | "Books"    |            1 | "New"      |
      | "www.amazon.com" | "data"    | "Books"    |            2 | "New"      |
