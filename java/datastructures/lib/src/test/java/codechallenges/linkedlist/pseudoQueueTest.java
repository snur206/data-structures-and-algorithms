package codechallenges.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pseudoQueueTest {
  @Test
  void testAddPseudoQueue() {
    pseudoQueue sut = new pseudoQueue();
    sut.enqueue(7);
    sut.enqueue(5);
    sut.enqueue(3);
    assertEquals("[7]->[5]->[3]->NULL",sut.toString());
  }
  @Test void testRemovePseudoQueue() {
    pseudoQueue sut = new pseudoQueue();
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    sut.dequeue();
    assertEquals("[2]->[3]->NULL",sut.toString());
  }
}
