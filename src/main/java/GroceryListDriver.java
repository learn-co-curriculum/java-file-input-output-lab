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

