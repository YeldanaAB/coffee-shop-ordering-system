
# Coffee Shop Ordering System ☕

A console-based coffee shop ordering system developed in Java to demonstrate object-oriented programming principles. The application uses predefined sample orders to create coffee and tea beverages, customize drinks, calculate prices, and generate itemized receipts.

## Features

- **Beverage Management:** Create coffee and tea objects with different sizes, ingredients, and iced or hot options.
- **Drink Customization:** Customize coffee with additional espresso shots or alternative milk options, and tea with sugar, honey, or lemon.
- **Dynamic Pricing:** Calculate beverage prices based on drink type, size, espresso shots, and milk selection.
- **Order Management:** Add multiple beverages to an order using an `ArrayList`.
- **Receipt Generation:** Display itemized receipts with beverage details, ingredients, prices, and order totals.
- **Additional Functionality:** Track the total number of beverages created and determine coffee caffeine levels based on espresso shots.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework (`ArrayList`)

## Object-Oriented Programming Concepts

The project demonstrates several core Java concepts:

- **Abstraction:** An abstract `Beverage` class defines shared attributes and abstract methods for pricing and ingredients.
- **Inheritance:** The `Coffee` and `Tea` classes extend `Beverage`.
- **Polymorphism:** Different beverage objects implement their own pricing and ingredient methods.
- **Interfaces:** The `Customizable` interface defines methods for adding and retrieving drink customizations.
- **Encapsulation:** Private fields and public methods manage beverage information.
- **Constructor Overloading:** Multiple constructors allow coffee objects to be created with default or specified milk options.

## Project Structure

```text
coffee-shop-ordering-system/
├── Beverage.java
├── Coffee.java
├── Tea.java
├── Customizable.java
├── Order.java
├── ProjectOneTester.java
└── README.md
```

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/YeldanaAB/coffee-shop-ordering-system.git
   ```

2. Navigate to the project directory:

   ```bash
   cd coffee-shop-ordering-system
   ```

3. Compile the Java files:

   ```bash
   javac *.java
   ```

4. Run the application:

   ```bash
   java ProjectOneTester
   ```

**Requirements:** Java Development Kit (JDK) installed.

## How It Works

The `ProjectOneTester` class demonstrates the ordering system by:

1. Creating coffee and tea beverages.
2. Applying customizations such as extra espresso shots, alternative milk, sugar, and honey.
3. Adding beverages to a customer order.
4. Generating a receipt with individual beverage prices and the total cost.
5. Displaying caffeine levels, customization details, beverage comparisons, and the total number of beverages created.

The program uses predefined sample orders rather than an interactive ordering menu.

## Project Purpose

This project was developed to practice Java object-oriented programming, class relationships, interfaces, collections, and application logic through a beverage ordering system.
