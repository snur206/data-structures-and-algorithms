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

  // Code Challenge 7
  public short kthFromEnd(int k)
  {
    int target = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      target++;
    }
    if (target < k)
      return 0;
    temp = head;
    for (int i = 1; i < target - k + 1; i++)
      temp = temp.next;
    return 0;
  }

  // Code Challenge 8
  public Node ziplist(Node curr1, Node curr2) {
    curr1 = head;
    curr2 = head;
    while(curr1 != null && curr2 != null) {
      Node temp1 = curr1.next;
      curr1.next = curr2;
      curr1 = temp1;
      Node temp2 = curr2.next;
      curr2.next = curr1;
      curr2 = curr2;
    }
    return head;
  }
}
