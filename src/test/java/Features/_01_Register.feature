Feature: Creating User Registration

  @SmokeTest
  Scenario: US01 Registration
    Given Navigate to ParaBank
    When Click On The Element
   | registerClick |
    Then Enter Data in Text Box
    | firstName  | Omar |
    | lastName    | Tarek |
    | address    | 123 Spring Valley |
    | city       |  MayWood          |
    | state      |  New Jersey       |
    | zipCode    | 01202             |
    | phone      |  11231232012      |
    | ssn        |   010203010       |
    | userName   |  Amar             |
    | passWord   | 00112244          |
    | confirmPassWord |  00112244    |
    Then Click On The Element
    Then Verification Is In Progress
    | Welcome to your account |
