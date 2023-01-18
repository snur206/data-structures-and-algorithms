package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

@Test void testAppend() {
  LinkedList sut = new LinkedList();
  sut.insert(1);
  sut.insert(2);
  sut.insert(3);
  sut.append(5);
  assertEquals("{1} -> {3} -> {5} -> {2} -> NULL", sut.toString());
}
@Test void testInsertBefore() {
  LinkedList sut = new LinkedList();
  sut.insert(1);
  sut.insert(2);
  sut.insert(4);
  sut.insertBefore(3, 4);
  assertEquals("{1} -> {2} -> {3} -> {4} -> NULL", sut.toString());
  }
  @Test void testInsertAfter() {
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(4);
    sut.insertAfter(3, 4);
    assertEquals("{1} -> {2} -> {4} -> {3} -> NULL", sut.toString());
  }
}
