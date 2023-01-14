package datastructures.linkedlist;

public class LinkedList {
  public Node head = null;

  public LinkedList() {

  }

  public LinkedList(int value) {
    head = new Node(value);
  }

  public void insert(int value) {
    Node tempNode = new Node(value);
    if (head != null) {
      tempNode.next = head;
    }
    head = tempNode;
  }

  public boolean includes(int value) {
    if (head == null)
      return false;
    Node tempNode = new Node(value);
    while (tempNode != null) {
      return true;
    }
    tempNode = tempNode.next;
  }
  return false;
}

  @Override
  public String toString()
  {
    return "null";  // TODO: implement me
  }
}
