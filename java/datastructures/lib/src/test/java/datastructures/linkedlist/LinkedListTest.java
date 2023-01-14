package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }
@Test void testInsert(){
  LinkedList sut = new LinkedList(3);
//  sut.head = new Node(3);
  sut.insert(3);
}
}
