package codechallenges.linkedlist;

import java.util.Stack;

public class pseudoQueue<I extends Number> {
  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  public void enqueue(int val) {
    stack1.push(val);
  }

  public void dequeue() {
    if(stack2.isEmpty()) {
      if(stack1.isEmpty());
    } else {
      while(!stack1.isEmpty()){
        stack2.push(stack1.pop());
      }
    }
  }

  @Override
  public String toString() {
    return "pseudoQueue{" +
      "stack1=" + stack1 +
      ", stack2=" + stack2 +
      '}';
  }
}
