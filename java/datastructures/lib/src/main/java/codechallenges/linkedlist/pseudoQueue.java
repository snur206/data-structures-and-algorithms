package codechallenges.linkedlist;

import java.util.Stack;

public class pseudoQueue {
  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  public void enqueue(int val) {
    stack1.push(val);
  }

  public void dequeue() {
    while(stack2.isEmpty()) {

    }
  }
}
