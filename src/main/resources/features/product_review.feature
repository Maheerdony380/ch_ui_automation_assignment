Feature: Amazon

  @UiTest
  Scenario: A Product Review
    Given As a user I Navigate to baseURL
    When Click on the hamburger menu in the top left corner
    When Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section
    When Click on Televisions under Tv, Audio & Cameras sub section
    When Scroll down and filter the results by Brand "Samsung"
    When Sort the "Samsung" results with price "High to Low"
    When Click on the second highest priced item
    When Switch the Window
    Then Assert that "About this item" section is present
    Then Log this section text to console