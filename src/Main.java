import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (int a : intList) {
            if (a > 0) positiveList.add(a);
        }

        for (int a : positiveList) {
            if (a % 2 == 0) evenList.add(a);
        }

        Collections.sort(evenList);

        System.out.println(evenList);
    }
}
