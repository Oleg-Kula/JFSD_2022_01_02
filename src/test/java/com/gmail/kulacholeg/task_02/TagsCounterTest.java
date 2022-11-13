package com.gmail.kulacholeg.task_02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TagsCounterTest {

    @Test
    void getTopTags() {
        List<String> stringList = new ArrayList<>();
        stringList.add("one two three #java #java #javascript");
        stringList.add("#html #css #java #javascript three two one");
        stringList.add("#python #css #java #c++ four five six");
        stringList.add("one two three #java #css #css");
        stringList.add("#java #javascrript #html #css #java #javascript");
        stringList.add("#java #python");
        //#java-6 #javascript-3 #html-2 #css-4 #python-2 #c++-1

        TagsCounter tc = new TagsCounter(stringList);
        Map<String, Integer> map = tc.getTopTags();

        assertEquals(6, map.get("#java"));
        assertEquals(4, map.get("#css"));
        assertEquals(3, map.get("#javascript"));
        assertEquals(2, map.get("#html"));
        assertEquals(2, map.get("#python"));

        assertNull(map.get("#c++"));

    }
}