package datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>{


  public void add(int value){
    Node<T> node = new Node(value);

    if(this.root == null) {
      this.root = node;
    }

    Node<T> current = this.root;

    while(current != null){
      if((Integer)node.value < (Integer) current.value){
        if(current.left == null) {
          current.left = node;
          return;
        }
        current = current.left;
      } else if ((Integer)node.value > (Integer) current.value){
        if(current.right == null) {
          current.right = node;
          return;
        }
        current = current.right;
      } else {
        return;
      }
    }
  }

  public boolean contains(int value){
    Queue<Node<T>> q = new LinkedList<>();
    if(this.root != null) q.add(this.root);

    while(!q.isEmpty()){
      Node<T> current = q.poll();
      if(current.value.equals(value)) return true;
      if(current.left != null) q.add(current.left);
      if(current.right != null) q.add(current.right);
    }
    return false;
  }

}
