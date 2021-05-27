package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

@Test
public class HashMapTest {

    private HashMap<String, String> testSubject;

    @BeforeMethod
    public void setup() {
        testSubject = new HashMap<>();
    }

    public void testPut() {
        testSubject.put("a", "b");

        assertEquals(testSubject.get("a"), "b");
    }

    public void testPutOverwrite() {
        testSubject.put("a", "b");
        testSubject.put("a", "c");

        assertEquals(testSubject.get("a"), "c");

    }

    public void testClear() {
        testSubject.put("a", "b");
        testSubject.put("c", "d");

        testSubject.clear();

        assertEquals(testSubject.size(), 0);
        assertNull(testSubject.get("a"));
        assertNull(testSubject.get("c"));
    }

    public void testNullKey() {
        testSubject.put(null, "b");


        assertEquals(testSubject.get(null), "b");
    }
}
