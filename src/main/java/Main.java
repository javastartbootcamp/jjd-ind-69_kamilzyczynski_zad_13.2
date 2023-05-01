import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        boolean correctNumber = true;
        List<Integer> numbers = new ArrayList<>();

        while (correctNumber) {
            System.out.println("Podaj liczbę całkowitą dodatnią: ");
            int nextNumber = scanner.nextInt();

            if (nextNumber > 0) {
                numbers.add(nextNumber);
            } else {
                correctNumber = false;
            }
        }
        try {
            ListUtils.reverseList(numbers);
            ListUtils.printSum(numbers);
            ListUtils.printMin(numbers);
            ListUtils.printMax(numbers);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
