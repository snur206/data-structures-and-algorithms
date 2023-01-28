package datastructures.tree;

import java.util.ArrayList;
import datastructures.tree.Node;

public class BinaryTree<T>
{
  Node <T> root;
  ArrayList<T> node = new ArrayList<>();

  public Object[] preOrderTraversal()
  {
    Object[] outputValues = null;
    // Should return something like "A B C D"
    // Can use an ArrayList internally
    // ArrayList.toArray() returns Object[], hence why Object[] is the return type
    // outputValues = preOrder(root);
    // TODO: implement me
    if(root.left != null)
    preOrderTraversal(root.left);
    if(root.right != null);
    preOrderTraversal(root.right);
    return outputValues;
  }

  public Object[] inOrderTraversal()
  {
    Object[] outputValues = null;
    // outputValues = inOrder(root);
    // TODO: implement me

    if(root.left != null);
    inOrderTraversal(root.left);
    return root.value;

    if(root.right != null);
    inOrderTraversal(root.right);
    return outputValues;
  }

  public Object[] postOrderTraversal()
  {
    Object[] outputValues = null;
    // outputValues = postOrder(root);
    // TODO: implement me
    if(root.left != null);
    postOrderTraversal(root.left);

    if(root.right != null);
    postOrderTraversal(root.right);

  return outputValues;
  }
}
