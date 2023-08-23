import org.junit.Test;

import java.util.function.Predicate;
import static org.assertj.core.api.Assertions.assertThat;

public class Test02_Predicate {

    @Test
    public void predicate_1() {

        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate = p1.negate();

        assertThat(notPredicate.test("")).isFalse();
        assertThat(notPredicate.test("Not Empty")).isTrue();
    }

    @Test
    public void predicate_2() {

        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);

        assertThat(p3.test("")).isFalse();
        assertThat(p3.test(null)).isFalse();
        assertThat(p3.test("Not Empty")).isTrue();
    }

    @Test
    public void predicate_3() {

        Predicate<String> p1 = s -> s.length() == 4;
        Predicate<String> p2 = s -> s.startsWith("J");

        Predicate<String> p3 = null;
        assertThat(p3.test("True")).isTrue();
        assertThat(p3.test("Julia")).isTrue();
        assertThat(p3.test("Java")).isFalse();

    }
}
