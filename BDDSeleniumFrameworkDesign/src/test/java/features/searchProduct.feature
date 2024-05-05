Feature: Search and place the order for products

Scenario: Search experience for product is same on home and offers page
Given user is on Greencart landing page
When user search short name "Tom" and exttracted actual name of product
Then user go and search short name "Tom" on offers page to check if product exist  
And validate product name on offers and landing page