import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test_Consumer {

    @Test
    public void consumer_1() {

        // Consumer<List<String>> consumer = List::clear;
        Consumer<List<String>> consumer = (List<String> strings) -> strings.clear();

        List<String> list = new ArrayList<>(Arrays.asList("e", "g", "h"));

        consumer.accept(list);

        assertThat(list).isEmpty();

    }

    @Test
    public void consumer_2() {

        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        /*Consumer<List<String>> consumer = list -> {
            // List<String> listCons = new ArrayList<>();
            c1.accept(list);
            c2.accept(list);
        };*/

        Consumer<List<String>> consumer = c1.andThen(c2);

        List<String> list = new ArrayList<>(Arrays.asList("a","b", "c"));

        consumer.accept(list);

        assertThat(list).containsExactly("a", "b", "c", "first", "second");
    }
}
