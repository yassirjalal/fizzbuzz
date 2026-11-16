package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1Returns1() {
        assertEquals("1", fizzBuzz.convert(1), "1 should return 1");
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", fizzBuzz.convert(2), "2 should return 2");
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.convert(3), "3 should return Fizz");
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.convert(5), "5 should return Buzz");
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15), "15 should return FizzBuzz");
    }

    @Test
    public void test30ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(30), "30 should return FizzBuzz");
    }

    // ===== Checking up to 100 =====

    @ParameterizedTest
    @ValueSource(ints = {
            3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54,
            57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99})
    public void testMultiplesOf3ReturnFizz(int number) {
        assertEquals("Fizz", fizzBuzz.convert(number), number + " should return Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100})
    public void testMultiplesOf5ReturnBuzz(int number) {
        assertEquals("Buzz", fizzBuzz.convert(number), number + " should return Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    public void testMultiplesOf3And5ReturnFizzBuzz(int number) {
        assertEquals("FizzBuzz", fizzBuzz.convert(number), number + " should return FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {
            1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28,
            29, 31, 32, 34, 37, 38, 41, 43, 44, 46, 47, 49, 52, 53, 56,
            58, 59, 61, 62, 64, 67, 68, 71, 73, 74, 76, 77, 79, 82, 83,
            86, 88, 89, 91, 92, 94, 97, 98})
    public void testOtherNumbersReturnTheNumber(int number) {
        assertEquals(String.valueOf(number), fizzBuzz.convert(number), number + " should return " + number);
    }
}
