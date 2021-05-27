package com.practicalunittesting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class StringUtils {

    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            reversed.append(s.substring(i - 1, i));
        }
        return reversed.toString();
    }
}
