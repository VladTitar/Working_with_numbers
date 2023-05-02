import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        List<Integer> evenPositiveNumbers = new ArrayList<>();
        for (int num : positiveNumbers) {
            if (num % 2 == 0) {
                evenPositiveNumbers.add(num);
            }
        }

        Collections.sort(evenPositiveNumbers);

        for (int num : evenPositiveNumbers) {
            System.out.print(num + " ");
        }
    }
}