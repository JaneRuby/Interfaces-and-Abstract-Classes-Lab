---
title: Creating Classes
type: lab
duration: "1:30"
creator:
    name: Alan Caceres
    city: NYC

---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Working with Interfaces and Abstract Classes

#### Starter code

There is no starter code.
Create a new project in IntelliJ for this lab

## Introduction

> ***Note:*** _This can be a pair programming activity or done independently._

In this lab you will be using your knowledge of classes, subclassing, interface and abstract class creation and implementation to create a few classes that will be used in the main method.

**This looks like a lot. It is, but it is a lot of repetition.**

## Exercise

#### Requirements

##### Abstract Class

- Create an abstract class called `Remote`.

- Give the abstract class the property needsBatteries and supportsUsb.

- Create a constructor that accepts parameters to set the properties you just created.

- Create getters and setters for the properties.

- Declare the following abstract methods, `channelUp`, `channelDown`, `volumeUp`, `volumeDown`; they all take no parameters and return nothing.

- Implement
`powerButtonPressed` that does not take any parameters and just prints out that the power button was pressed.

- Implement `numberButtonPressed`, that takes in an `int` parameter and appends/concatenates the `int` parameter to the `String` ```"Changing channel to " ``` then prints it out to the terminal.

##### Interfaces
- Create an interface class named `WaterProof`.
- Inside this class, declare a method `isWaterProof`. **What do you think it should return?**


- Create an interface class named `Rechargeable`.
- Inside this class, declare a method `isRechargeable`. **What do you think it should return?**


- Create an interface class named `Universal`.
- Inside this class, declare a method `supportsBrands`. It should return nothing.

##### Concrete Class
- Create three concrete classes that extends the abstract class `Remote`, name the concrete class one of your favorite brands. (Samsung, LG, Panasonic, Sony, etc.)

- Implement the methods you declared in the `Remote` abstract class which are required to be implemented in each concrete class.

- Make sure the implementations output something different for each concrete class.

- Implement the `WaterProof`, `Rechargeable`, and `Universal` interfaces.

- Implement the methods defined by those interfaces. You can choose what to do, but at the minimum print something out to the terminal.

##### Main Java Class
- Create a `List` of `Remote` objects.

- Populate the `List` of `Remote` objects with new instances of the concrete classes you created.

- Create a loop that loops as many times as there are items in the `List` of `Remote` objects. (You choose the kind of loop)

- Inside the loop call the `numberButtonPressed` method on each object and pass it the current iteration value of the loop.

- Inside the loop call the `channelUp`, `channelDown`, `volumeUp`, `volumeDown` methods on each object.

**Bonus:**
- Create 3 more concrete classes that extend `Remote` and use them in the loop.

- Create another interface, `FingerPrintScanner`, and declare a method `startScan` that accepts a `String` parameter.

- In your classes, implement logic for the `startScan` method that will let you use the remote only when the correct input is given.

#### Deliverable

Pull request from forked Project on GitHub that contains your implementation of the `Remote` abstract class, the `WaterProof`, `Rechargeable`, and `Universal` interface classes, and the main program that uses the classes you created.

## Additional Resources

- Oracle: [Creating abstract classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
- Oracle: [Creating an Interface](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- Oracle: [Defining a class](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Oracle: [Instantiating a class](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)
