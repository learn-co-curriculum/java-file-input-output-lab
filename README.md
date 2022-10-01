# File IO Lab

## Learning Goals

- Practice reading and writing a text file.

## Instructions

Create a program to write and read in a grocery list.

To implement the reading and writing of a text file, consider the following
instructions and tips:

- Modify the `GroceryListDriver` class.
  - Write the method to write to a text file.
    - Use a `FileWriter` object to write out a grocery list.
    - Each item in the list should be on its own new line.
    - Refer back to the File Input Output lesson.
  - Write the method to read a text file line-by-line.
    - Use a `Scanner` object to read from the text file.
    - Return a `String` to print out to the console the list of groceries.
    - Refer back to the File Input Output Lesson.
- When running the `GroceryListDriver` class, pass in a file named
  `grocery-list.txt`.
- Remove the `@Disabled` annotation from the unit tests and ensure that the
  tests pass successfully. Refactor as needed.

## Starter Code

Consider the `GroceryListDriver` class that has some starter code in it for you
to use:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroceryListDriver {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<String>(Arrays.asList(
                "Apples",
                "Bananas",
                "Cookies"
        ));
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file are we working with today?");
        String filepath = scanner.nextLine();

        writeFile(filepath, groceryList);
        System.out.println(readFile(filepath));
    }

    public static String readFile(String filepath) {
        // Write your code here!
    }

    public static void writeFile(String filepath, List<String> groceryList) {
        // Write your code here!
    }
}
```

Once you have implemented the `readFile()` and `writeFile()` methods, you
should have the following output printed to the console:

```plaintext
Apples
Bananas
Cookies

```

## Unit Tests

Consider the following unit tests to help you implement the `writeFile()` and
`readFile()` methods:

```java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroceryListDriverTest {

    List<String> groceryList;

    @BeforeEach
    void setUp() {
        groceryList = new ArrayList<String>();
    }

    @AfterEach
    void tearDown() {
    }

    @Disabled
    @Test
    void testOneItem() {
        String filepath = "grocery-test1.txt";
        groceryList.add("Bananas");
        GroceryListDriver.writeFile(filepath, groceryList);
        assertEquals("Bananas\n", GroceryListDriver.readFile(filepath));
    }

    @Disabled
    @Test
    void testMultipleItems() {
        String filepath = "grocery-test2.txt";
        groceryList.add("Chips");
        groceryList.add("Salsa");
        groceryList.add("Peanut Butter");
        groceryList.add("Jelly");
        String expected = String.format("%s%n%s%n%s%n%s%n", "Chips", "Salsa", "Peanut Butter", "Jelly");
        GroceryListDriver.writeFile(filepath, groceryList);
        assertEquals(expected, GroceryListDriver.readFile(filepath));
    }

    @Disabled
    @Test
    void testNoItems() {
        String filepath = "grocery-test3.txt";
        GroceryListDriver.writeFile(filepath, groceryList);
        assertEquals("", GroceryListDriver.readFile(filepath));
    }
}
```
