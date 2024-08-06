# Waste Recycling System - Dustbin Project

## Overview

This project simulates a waste recycling system using Java classes to model different types of garbage and a dustbin
that manages these items based on their type (house waste, paper, and plastic).

## Components

### Dustbin Class

Represents a dustbin that can accept various types of garbage.

- **Attributes**:
    - `color`: Color of the dustbin.
    - `garbageArr`: Array to store instances of `Garbage` and its subclasses.

- **Methods**:
    - `throwOutGarbage(Garbage garbage)`: Throws a `Garbage` object into the dustbin, ensuring it meets specific requirements.
    - `getHouseWasteCount()`, `getPaperCount()`, `getPlasticCount()`: Counts and returns the number of items of each type in the dustbin.
    - `emptyContents()`: Empties the dustbin by resetting `garbageArr`.
    - `printContents()`: Prints the contents of the dustbin to the console.
    - `toString()`: Provides a detailed string representation of the dustbin and its contents.
    - `displayContents()`: Prints the string representation of the dustbin using `toString()`.

### Garbage Class

Represents a basic garbage item with a name.

### PaperGarbage Class

Extends `Garbage`, includes a flag `squeezed` indicating if the paper garbage has been squeezed.

### PlasticGarbage Class

Extends `Garbage`, includes a flag `cleaned` indicating if the plastic garbage has been cleaned.

### DustbinContentException Class

Custom exception thrown when inappropriate garbage type is attempted to be thrown into the dustbin.

## Usage

The `Main` class provides an example of how to use the `Dustbin` class and its related subclasses:

1. Create instances of different types of garbage (`Garbage`, `PlasticGarbage`, `PaperGarbage`).
2. Demonstrate throwing these items into a `Dustbin` instance, handling exceptions when throwing inappropriate items.
3. Show how to manage garbage by cleaning (for plastic items) or squeezing (for paper items).
4. Display the contents of the dustbin before and after emptying it.

## How to Run

To run this project:

1. Ensure you have Java installed on your system.
2. Compile all `.java` files (`Dustbin.java`, `Garbage.java`, `PaperGarbage.java`, `PlasticGarbage.java`, `DustbinContentException.java`, `Main.java`) using `javac`.
3. Run the `Main` class using the command: `java com.codecool.wasterecycling.Main`.

## Notes

- This project demonstrates basic object-oriented principles in Java.
- It illustrates exception handling and polymorphic behavior with garbage types.
