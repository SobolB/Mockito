package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AfishaManagerTest {

    @Test
    public void test() {
        AfishaManager afisha = new AfishaManager(3);
        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
