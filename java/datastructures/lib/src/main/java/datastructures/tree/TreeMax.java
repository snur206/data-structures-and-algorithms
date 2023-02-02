package datastructures.tree;

public class TreeMax {
  int max = max;
        if (root == null)
    return max;
        else {
    int left_max = maxBinaryTree(root.getLeft());
    int right_max = maxBinaryTree(root.getRight());
    if (left_max > right_max)
      max = left_max;
    else
      max=right_max;

    if (root.getElement() > max)
      max = root.getElement();
  }
        return max;
}
