- The `target` attribute specifies where to open the linked document:

  ```html
  <a href="https://www.w3schools.com" target="_blank">Visit W3Schools</a>
  ```

  - Value Description
    - `_blank` Opens the linked document in a new window or tab
    - `_self` Opens the linked document in the same frame as it was clicked (this is default)
    - `_parent` Opens the linked document in the parent frame
    - `_top` Opens the linked document in the full body of the window
    - `framename` Opens the linked document in the named iframe

- The `figure` element represents self-contained content and will allow you to associate an image with a caption.

  - A figure caption (`figcaption`) element is used to add a caption to describe the image contained within the figure element.
  - Emphasize the word in the figcaption element by wrapping it in an emphasis `em` element.

- List item

  - `<ul>` for unodered items
  - `<ol>` for ordered items

- `form` element

  - `action` attribute where form data should be sent. For example,

    ```html
    <form action="/submit-url"></form>
    ```

  - `name` attribute and assign it a value to represent the data being submitted.

- Use the `button` element to create a clickable button.
