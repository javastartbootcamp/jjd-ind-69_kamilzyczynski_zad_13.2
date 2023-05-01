import java.io.IOException;
import java.util.List;

public class ListUtils {
    public static void reverseList(List<Integer> numbers) throws IOException {
        if (numbers.size() < 1) {
            throw new IOException("Nie wprowadzono ani jednej prawidłowej liczby");
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.println(numbers.get(numbers.size() - 1 - i));
            } else {
                System.out.print(numbers.get(numbers.size() - 1 - i)  + ", ");
            }
        }

    }

    public static void printSum(List<Integer> numbers) throws IOException {
        if (numbers.size() < 1) {
            throw new IOException("Nie wprowadzono ani jednej prawidłowej liczby");
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i) + " = ");
            } else {
                System.out.print(numbers.get(i) + " + ");
            }
        }
        System.out.println(sum);
    }

    public static void printMax(List<Integer> numbers) throws IOException {
        if (numbers.size() < 1) {
            throw new IOException("Nie wprowadzono ani jednej prawidłowej liczby");
        }
        int max = Integer.MIN_VALUE;

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Największa liczba w liście to " + max);
    }

    public static void printMin(List<Integer> numbers) throws IOException {
        if (numbers.size() < 1) {
            throw new IOException("Nie wprowadzono ani jednej prawidłowej liczby");
        }
        int min = Integer.MAX_VALUE;

        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + min);
    }
}
