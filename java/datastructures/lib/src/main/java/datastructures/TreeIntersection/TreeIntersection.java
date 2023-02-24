package datastructures.TreeIntersection;


import com.sun.source.util.Trees;
import datastructures.queue.Node;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
  public static Set<Integer> treeIntersection(Trees trees1, Trees trees2){
    Set<Integer>set = new HashSet<>();
    if(trees1.root == null || trees2.root ==null){
      return set;
    }
    Set<Integer>set1 = new HashSet<>();
    Set<Integer>set2 = new HashSet<>();
    traverse(trees1.root, set1);
    traverse(trees2.root, set2);
    for (Integer value : set1){
      if(set2.contains(value)){
        set.add(value);
      }
    }
    return set;
  }
  private static void traverse(Node node, Set<Integer> set){
    if (node == null) {
      return;
    }
    set.add((Integer) node.value);
    traverse(node.left, set);
    traverse(node.right, set);
  }

}
