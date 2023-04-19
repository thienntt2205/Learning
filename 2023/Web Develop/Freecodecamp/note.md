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
- Add another self-closing meta element within the head. Give it a name attribute set to viewport and a content attribute set to width=device-width, initial-scale=1.0 so your page looks the same on all devices.
-  Multiple classes can be added to an element by listing them in the `class` attribute and separating them with a space. 
- With hex colors, 00 is 0% of that color, and FF is 100%.
  - Hexadecimal base 16 values, go from 0 - 9, then A - F
- A gradient is when one color transitions into another. The CSS `linear-gradient` function lets you control the direction of the transition along a line, and which colors are used.
  - `linear-gradient` function actually creates an image element, and is usually paired with the background property which can accept an image as a value.
    - If no gradientDirection argument is provided to the linear-gradient function, it arranges colors from top to bottom, or along a 180 degree line, by default.
  - CSS `opacity` property, you can control how opaque or transparent an element is. With the value 0, or 0%, the element will be completely transparent, and at 1.0, or 100%, the element will be completely opaque like it is by default.
  - CSS The `rgba` function works just like the rgb function, but takes one more number from 0 to 1.0 for the alpha channel:
  - CSS The `box-shadow` property lets you apply one or more shadows around an element. basic syntax:
  ```css
  box-shadow: offsetX offsetY color;
  ```
    - how the offsetX and offsetY values work:
      - both offsetX and offsetY accept number values in px and other CSS units
      - a positive offsetX value moves the shadow right and a negative value moves it left
      - a positive offsetY value moves the shadow down and a negative value moves it up
      - if you want a value of zero (0) for any or both offsetX and offsetY, you don't need to add a unit. Every browser understands that zero means no change.
    - The height and width of the shadow is determined by the height and width of the element it's applied to. You can also use an optional spreadRadius value to spread out the reach of the shadow. More on that later.
    - CSS The `vh` unit stands for viewport height, and is relative to 1% of the `height` of the viewport.
    - The `method` attribute specifies how to send form-data to the URL specified in the action attribute. The form-data can be sent via a GET request as URL parameters (with method="get") or via a POST request as data in the request body (with method="post").
    - CSS The `rem` unit stands for root em, and is relative to the font size of the html element.