Feature: Post functionality

  Scenario Outline: As a customer I want to create a new post
    Given I can create a new post
    When I send the post to be created with post id <post_id>, title <title> and content <content>
    Then I should be able to see my newly created post

    Examples:
    | post_id | title          | content |
    | 12345   | New post title | new post content |
