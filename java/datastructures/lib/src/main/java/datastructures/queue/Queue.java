package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;
//  int returnValue;
  public void enqueue(T valueToEnqueue)
  {
    Node<T>node = new Node(valueToEnqueue);
    back.next = node;
    back = node;
  }

  public T dequeue()
  {
    Node<T> temp = front;
    front = front.next;
    temp.next = null;
    return temp.value;
  }

  public  T peek() throws NullPointerException
  {
    if(front == null)
      throw new NullPointerException("Queue is empty");

      return front.value;
  }

  public boolean isEmpty()
  {
    return (front == null);
  }

  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front +
      ", back=" + back +
      '}';
  }
}
