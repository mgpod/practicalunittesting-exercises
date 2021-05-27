package com.practicalunittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class FahrenheitCelciusConverterTest {

    @Test(dataProvider = "getCelciusData")
    public void shouldConvertCelciusToFahrenheit(int celcius, int expected) {
        assertEquals(FahrenheitCelciusConverter.toFahrenheit(celcius), expected);
    }

    @DataProvider
    public Object[][] getCelciusData() {
        return new Object[][] {
                {0, 32},
                {37, 98},
                {100, 212}
        };
    }

    @Test(dataProvider = "getFahrenheitData")
    public void shouldConvertFahrenheitToCelcius(int fahrenheit, int expected) {
        assertEquals(FahrenheitCelciusConverter.toCelcius(fahrenheit), expected);
    }

    @DataProvider
    public Object[][] getFahrenheitData() {
        return new Object[][] {
                {32, 0},
                {100, 37},
                {212, 100}
        };
    }

}
