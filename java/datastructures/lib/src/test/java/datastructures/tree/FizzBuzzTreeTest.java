package datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class FizzBuzzTreeTest {
  @Test void fizzBuzzTest() {
    FizzBuzzTree sut = new FizzBuzzTree();
    assertEquals("Fizz", sut.equals(3));
    assertEquals("Buzz", sut.equals(5));
    assertEquals("FizzBuzz", sut.equals(15));
    assertEquals(" ", sut.equals(0));
  }
}
