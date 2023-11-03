package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom11ToTenThen80() {
        int start = 11;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 80;
        assertThat(result).isEqualTo(expected);
    }
}