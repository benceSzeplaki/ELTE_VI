package test;


import main.gyak2.FibonacciSequence;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSequenceTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "1,2",
            "2,3",
            "3,4",
            "5,5"
    })
    void testFirstSixFibonacciSequence(int expected, int n) {
        assertEquals(expected, FibonacciSequence.getWithRecursion(n));
        assertEquals(expected, FibonacciSequence.getWithIteration(n));
    }
}
