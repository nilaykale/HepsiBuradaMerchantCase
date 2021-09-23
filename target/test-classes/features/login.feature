Feature: Test login feature

  Scenario Outline: Try to login with different credentials
    Given User is on homepage
    Then User navigates to login page
    Then User enters <email> and <password>
    Then Click on "Giriş Yap " button

    Examples:
      | email            | password |
      | test123@mail.com | 1234567  |
      | test123          | 23123123 |

