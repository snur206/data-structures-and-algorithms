package codechallenges.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListChallengesTest
{
  @Test
  void testAChallenge()
  {
    LinkedListChallenges sut = new LinkedListChallenges();
    sut.linkedListChallenge06();
    System.out.println("test something here");
    assertTrue(true);
  }

    @Test void testAddPseudoQueue() {
      pseudoQueue<Integer> sut = new pseudoQueue<>();
      sut.enqueue(7);
      sut.enqueue(5);
      sut.enqueue(3);
      assertEquals("[3]->[5]->[7]->NULL",sut.toString());
    }
  @Test void testRemovePseudoQueue() {
    pseudoQueue<Integer> sut = new pseudoQueue<>();
    sut.enqueue(1);
    sut.enqueue(2);
    sut.enqueue(3);
    sut.dequeue();
    assertEquals("[3]->[2]->[1]->NULL",sut.toString());
  }
  }


