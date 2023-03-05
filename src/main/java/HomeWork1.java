import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork1 {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));

        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    public static void main(String[] args)  {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(1, 5, 15, 45, 88, 132, 210)).stream();

        findMinMax(
                stream,
                Integer::compareTo,
                (x, y) -> System.out.printf("min: %s, max: %s%n", x, y)
        );

        stream.close();
    }





}
