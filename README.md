# Starting Price Lookup

At Bell, our sales department receives thousands of calls per day from customers inquiring about the starting prices of our smartphones. One of the sales directors is very hip and loves vintage things, especially vintage graphic cards! Everyone in the department must use new computers with weak graphic cards that cannot load most of today's graphic intensive websites.

To help our sales people get information quickly to serve our customers more efficiently, we need to create a program that spits out starting prices for a given phone in a simple webpage.

## Technology

Below is a list of technology to use:

- You can use any programming language, we recommend: Ruby, Python, or Java
  - Optional: You can use a framework like Rails or Django if it makes things easier
- Selenium WebDriver
- HTML
- CSS (don't spend too much time on css)

## Expectations

- I should be able to select any of the top 12 phones as listed on the [Bell Smartphone page](https://www.bell.ca/Mobility/Smartphones_and_mobile_internet_devices)
  - Note: You can use a pre-defined Array (Ex: ['Huawei P30 Pro', 'Samsung Galaxy S10e', ...] )
- When a phone is selected and I hit submit, Selenium should run in the background to visit the same [webpage](https://www.bell.ca/Mobility/Smartphones_and_mobile_internet_devices) and get the starting price
- Once the price is obtained it should print the starting price
