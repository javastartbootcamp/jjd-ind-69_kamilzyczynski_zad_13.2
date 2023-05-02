import java.util.List;

public class ListUtils {
    public static void reverseList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.println(numbers.get(numbers.size() - 1 - i));
            } else {
                System.out.print(numbers.get(numbers.size() - 1 - i)  + ", ");
            }
        }
    }

    public static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i) + " = ");
            } else {
                System.out.print(numbers.get(i) + " + ");
            }
        }
        System.out.println(sum);
    }

    public static void printMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Największa liczba w liście to " + max);
    }

    public static void printMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + min);
    }
}
