import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class HomeWork2 {

    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(1, 5, 15, 45, 88, 132, 210)).stream()
                .filter(e -> e % 2 == 0);
        stream.forEach(System.out::println);
    }
}
