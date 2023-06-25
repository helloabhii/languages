// Reference JDK Classes and Non-JDK Classes
/*
 A class that is part of the core JDK does not need to be added to the classpath to be executed.
So this example, referencing the Scanner and MatchResult classes, 
can be executed simply with the java launcher:
 */

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {

    public static void main(String... args) {
        String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign 
                9 homecoming 1 
                freight car
                """;

        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
        }
    }
}
