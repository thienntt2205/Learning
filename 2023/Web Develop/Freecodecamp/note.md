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

- In order to make a checkbox checked or radio button selected by default, you need to add the `checked` attribute to it. There's no need to set a value to the checked attribute. Instead, just add the word checked to the input element, making sure there is space between it and other attributes.

- All page content elements that should be rendered to the page go inside the `body`
- Other important information goes inside the `head` element.
- All pages should begin with `<!DOCTYPE html>`. This special string is known as a declaration and ensures the browser tries to meet industry-wide specifications.
- To start taking control presentation and appearance of the content add `style` element within `head` element

- For the styling of the page to look similar on mobile as it does on a desktop or laptop, you need to add a `meta` element with a special `content` attribute.

```html
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
```

- The div element is used mainly for design layout purposes unlike the other content elements you have used so far.

- article elements commonly contain multiple elements that have related information

- The `class` attribute is part of the Global Attributes, and can be used on any HTML element.

- `padding` (css)add more space between the content and the sides
- The default properties of an `hr` element will make it appear as a thin light grey line. You can change the height of the line by specifying a value for the height property.