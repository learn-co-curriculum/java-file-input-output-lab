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