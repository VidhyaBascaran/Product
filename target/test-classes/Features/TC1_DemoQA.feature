Feature: Verifying The Registration Of DemoQA

  Scenario Outline: Verifying the registration form in DemoQA 
    Given User is on DemoQA Register page
    When User enters "<firstName>","<lastName>","<userName>" and "<password>"
    Then User Should Verify success message after register "User exists!"

    Examples: 
      | firstName | lastName | userName       | password  |
      | vidhya    | Baskaran | VidhyaBaskaran | Viba@2023 |
      
      