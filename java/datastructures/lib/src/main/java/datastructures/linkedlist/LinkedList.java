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
      head = tempNode;
    } else {
      tempNode.next = this.head;
      head = tempNode;
    }
  }

  public boolean includes(int value) {
    Node curr = head;
    while (curr != null) ;
    {
      if (curr.value == value) {
        return true;
      } else {
        curr = curr.next;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    Node curr = head;
    String outputString = "";
    while (curr != null) {
      outputString += "{ " + curr.value + "} -> ";
    }
    outputString += "NULL";
    return outputString;
  }

  // Code Challenge 6
  public void append(int value) {
    Node newNode = new Node(value);
    if (head != null) {
      Node curr;
      curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    } else {
      head = newNode;
    }
  }

  public void insertBefore(int value, int newValue) {
    Node curr = head;
    Node prev = null;
    if (head != null) {
      while (curr != null) {
        if (curr.value == value) {
          Node before = new Node(newValue);
          before.next = curr;

          if (prev != null) {
            prev.next = before;
          } else {
            head = before;
          }
          return;
        }
      }
      prev = curr;
      curr = curr.next;
    }

  }

  public void insertAfter(int value, int newValue) {
    Node newNode = new Node(value);
    Node curr = head;
    while (curr != null) {
      if (curr.value == value) {
        newNode.next = curr.next;
        curr.next = newNode;
      }
      curr = curr.next;
    }
  }

}
