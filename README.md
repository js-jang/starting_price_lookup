# Starting Price Lookup

At Bell, our sales department receives thousands of calls per day from customers inquiring about the starting prices of our smartphones. One of the sales directors is very hip and loves vintage things, especially vintage graphic cards! Everyone in the department must use new computers with weak graphic cards that cannot load most of today's graphic intensive websites.

To help our sales people get information quickly to serve our customers more efficiently, we need to create a program that spits out starting prices for a given phone in a CLI (Command-line interface).

## Technology

Below is a list of technology to use:

- You can use any programming language, we recommend: Ruby, Python, or Java
- You can use any environment, we recommend a linux environment
- Selenium WebDriver
- A driver like chrome driver (chrome) or gecko driver (firefox)

## Expectations

- As a user I should be able to select any of the top 12 phones as listed on the [Bell Smartphone page](https://www.bell.ca/Mobility/Smartphones_and_mobile_internet_devices)
- When a phone is selected, Selenium should run in the background to visit the same [webpage](https://www.bell.ca/Mobility/Smartphones_and_mobile_internet_devices) and get the starting price
- Once the price is obtained it should print the phone's name and price to the command-line

## Things to keep in mind

- You should build the CLI so that it allows the sales staff to find the price efficiently
- How you make the CLI user-friendly is entirely up to you
- You can have a pre-defined array of the top 12 phones as shown in the [webpage](https://www.bell.ca/Mobility/Smartphones_and_mobile_internet_devices)
- Make sure you have a detailed README with instructions on how to run your program

## How to manage your work

- Create a fork of this repo
- Make sure the repo is set to **private** and add me to the repo `jbhandari`
- Make sure to commit your code in logical portions
  - ex: `Added ability to fetch price`
