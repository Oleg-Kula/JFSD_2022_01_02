package com.gmail.kulacholeg.task_01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerArrayCalculateTest {
    IntegerArrayCalculate integerArrayCalculate = new IntegerArrayCalculate();
    int[] arr = {1, -3, 0, 7, 4, -2};

    @Test
    void arrayCalculateTest() {
        int[] expected = {0, 1, 4, 7};
        assertArrayEquals(expected, integerArrayCalculate.arrayCalculate(arr));
    }

    @Test
    void collectionsMethodCalculate() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(4);
        expected.add(7);

        assertEquals(expected, integerArrayCalculate.collectionsMethodCalculate(arr));

    }

    @Test
    void streamMethodCalculate() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(4);
        expected.add(7);

        assertEquals(expected, integerArrayCalculate.streamMethodCalculate(arr));
    }
}