package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  public void push(T valueToPush)
  {
    Node<T> node = new Node(valueToPush);
    node.next = top;
    top = node;
  }

  public T pop()
  {
    Node<T> temp = top;
    top = top.next;
    temp.next = null;
     return temp.value;
//    return null;
  }

  public  T peek() throws NullPointerException
  {
    if(top == null)
      throw new NullPointerException("Stack is empty");

      return top.value;
  }
  public boolean isEmpty()
  {
    return (top == null);
  }

  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top +
      '}';
  }
}
