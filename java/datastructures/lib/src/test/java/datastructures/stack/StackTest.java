package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest
{
  @Test void testAMethod()
  {
    Stack<Integer> sut =  new Stack();
    sut.push( 7);
    assertEquals("{7} -> NULL", sut.toString());
  }
  @Test void testAMethod2()
  {
    Stack<Integer> sut =  new Stack();
    sut.push( 1);
    sut.push( 2);
    sut.push( 3);
    assertEquals("{3} ->{2} ->{1} -> NULL", sut.toString());
  }
}

