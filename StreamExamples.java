import java.util.; import java.util.stream.;

public class StreamExamples {

public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(
        10, 15, 20, 11, 25, 30, 14, 100, 125
    );

    // 1. Find all even numbers using Stream API
    List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)  // Keep only even numbers
            .collect(Collectors.toList());

    System.out.println("Even Numbers: " + evenNumbers);
    // Output: [10, 20, 30, 14, 100]


    // 2. Find all numbers starting with 1 using Stream API
    List<Integer> numbersStartingWith1 = numbers.stream()
            .filter(n -> String.valueOf(n).startsWith("1"))
            // Convert each number to String and check its first digit
            .collect(Collectors.toList());

    System.out.println("Numbers Starting With 1: " + numbersStartingWith1);
    // Output: [10, 15, 11, 14, 100, 125]


    // 3. Find the first element of the list using Stream API
    Optional<Integer> firstElement = numbers.stream()
            .findFirst();  // Returns the first element as an Optional

    System.out.println("First Element: " + firstElement.orElse(null));
    // Output: 10
}


}