package com.practicalunittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class StringUtilsTest {

    /**
     * Test reverse method
     * @param input the input String
     * @param expected the expected output
     */
    @Test(dataProvider = "getStrings")
    public void testReverse(String input, String expected) {
        String actual = StringUtils.reverse(input);

        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] getStrings() {
        return new Object[][] {
                {"", ""},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "cba"}
        };
    }


}
