# Selenium-Web-Automation-Framework
Automation Framework using PageFactory Selenium (Amazon.com)


# FrameWork

Pagefactory Model with BDD using Cucumber 

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


for Easy Scalability - if were to be implemented for other categories , then we just need to add one more class file for other page . 

Framework can be reused 

Easy reusablility 

Easy Readability

No Hardcoding has been done 


 
