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
    if(head != null) {
      head = tempNode;
    } else {
      tempNode.next = this.head;
      head = tempNode;
    }
  }

  public boolean includes(int value) {
    Node curr = head;
    while(curr != null); {
      if(curr.value == value) {
        return true;
      } else {
        curr = curr.next;
      }
    }
    return false;
  }



  @Override
  public String toString()
  {
    Node curr = head;
    String outputString = "";
    while(curr != null) {
      outputString += "{ " + curr.value + "} -> ";
    }
    outputString += "NULL";
    return outputString;
  }
}
