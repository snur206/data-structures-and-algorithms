### 401 Data Structures, Code Challenges
Table reference from akkaben
| Table of Contents - Data Structures                                    |
| -----------------------------------------------------------------------|
| [Whiteboarding: Array Reversal](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge1.png)
| [Whiteboarding: Array Insert Shift](https://github.com/snur206/data-structures-and-algorithms/blob/array-insert-shift/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge2.png) |
| [Whiteboarding: Binary Search](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge03.png) |
| [Linked List](https://github.com/snur206/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/linkedlist) |
| [Linked List Insertions](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java) |
| [Linked List Zip](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java) |
| [Stacks & Queues](https://github.com/snur206/data-structures-and-algorithms/blob/stack-and-queue/java/datastructures/README.md) |
| [Stacks & Queues Pseudo](https://github.com/snur206/data-structures-and-algorithms/blob/stack-queue-pseudo/java/datastructures/lib/src/main/java/codechallenges/linkedlist/pseudoQueue.java) |
| [Stacks & Queues Animal Shelter](https://github.com/snur206/data-structures-and-algorithms/blob/stack-queue-pseudo/java/datastructures/lib/src/main/java/codechallenges/linkedlist/animal/animalShelter.java) |
| [Stacks & Queues Valid Brackets](https://github.com/snur206/data-structures-and-algorithms/blob/stack-queue-pseudo/java/datastructures/lib/src/main/java/codechallenges/linkedlist/brackets/Brackets.java) |
| [Trees](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/tree) |



# Code Challenge 2:

## Insert to Middle of an Array

Write a function called insertShiftArray which takes in an array and a value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Whiteboard Process

<img width="1107" alt="Screenshot 2023-01-11 at 9 22 39 AM" src="https://user-images.githubusercontent.com/115438182/211879883-8e23a8ea-2a15-44a6-a740-b47644c3f07b.png">

## Approach & Efficiency

Approach was to set values for the first index and last in the array. If the key value pair was greater compared to the value in the midpoint that it is being tested, to add it infront of the value. Using Time O(n) because it is linear and going through each array value and Space O(n) to reate an array with added size +1.

# Code Challenge 3:

## Binary Search

Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the value of the search key, or -1 if the element is not in the array.

## Whiteboard Process

<img width="1200" alt="Screenshot 2023-01-11 at 3 15 12 PM" src="https://user-images.githubusercontent.com/115438182/211940726-082aafe4-4428-4770-9edd-3e682c6e5861.png">

## Approach & Efficiency

Approach was to set values for the first index and last in the given array. The value helped with deciding the midpoint that is being compared to the key. If midpoint is lesser than the key value , the key value is forward -1 or too low. If midpoint is greater than the key value, the key value is behind +1 or too high. If midpoint is equal to the key value, return the index Using Time O(n) because a loop was used and Space O(n) to use the size of the array.

# Code Challenge 5:

## Singly Linked List

Create a Linked List class that contains the methods insert, includes, and to string with arguments and returns.

## Challenge

Can successfully instantiate an empty linked list
Can properly insert into the linked list
The head property will properly point to the first node in the linked list
Can properly insert multiple nodes into the linked list
Will return true when finding a value within the linked list that exists
Will return false when searching for a value in the linked list that does not exist
Can properly return a collection of all the values that exist in the linked list

## Approach & Efficiency

Just researching things and implementing them.

## Big O
Insert: space O(1) size of 1 node time O(1) traversing at all
Includes: O(1) time O(n) looking for the last link traversing the linked list once
toString: O(1) time O(n) traversing the whole list

## API
public void insert(int value)

public boolean includes(int value)

public String toString()

# Code Challenge 6:

# Challenge Summary
Create a singly linked list that include and "append", "insert before", and "insert after" method.

## Whiteboard Process
<img width="1005" alt="codeChallenge6" src="https://user-images.githubusercontent.com/115438182/213084200-196329ef-03bf-4b6f-ab81-704d3a587b75.png">


## Approach & Efficiency
For each function, you traverse the linked list, except for the append function where you traverse each node. Time O(N) is used because of that and space O(n) is used for the space to get the variables you traverse for the nodes as the list grows.

## Solution
[Solution Code](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java)

# Code Challenge 7:

# Challenge Summary
Write a method for the Linked List class having a number, k, as a parameter and return the node’s value that is k places from the tail of the linked list.

## Whiteboard Process
<img width="818" alt="codeChallenge7" src="https://user-images.githubusercontent.com/115438182/213358836-31954650-373e-49ec-806e-3debd060e50a.png">

## Approach & Efficiency
The approach that I took was to find the length of the linked list and find the stopping point(Args k). Using O(n) for time since I am looping in the code and for space O(1) since the list is not growing.

## Solution
[Solution Code CC 7](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java)

# Code Challenge 8:

# Challenge Summary
Write a function called zip lists that takes a linked lists and zips another linked lists
Return new linked list
## Whiteboard Process
<img width="788" alt="codeChallenge8" src="https://user-images.githubusercontent.com/115438182/213624391-47016ad3-33e7-4a2f-8c13-041012182fb0.png">

## Approach & Efficiency
The approach that I took was to take two linked lists and returning a list that combines/zips through both linked lists. Using O(n) for time since I am looping in the code and for space O(n) since the list is growing.

## Solution
[Solution Code CC 8](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java)

# Code Challenge 10:
## Collaborated w/ Adrian

## Stacks and Queues and Challenge
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue. For Stack, the class contains push, pop, peek, and isEmpty methods. For Queue, the class contains enqueue, dequeue, peek, and isEmpty methods.

## Approach & Efficiency
Completed the methods for both stack and queque. Push, pop, peek, dequeue and isEmpty all use the O(1) for both time and space because you are doing one thing. Enqueue uses the time O(n) because it is traversing through the queue and O(1) for space.
## API
Stack: stacking on top of each other
Queue: a line of some sort
Push(t val):Adds new node to stack and sets new node as top
pop(): Removes node from top of stack and returns the node’s value
Peek(): Returns value from top of stack
Enqueue(t val): Add a node to the back of your queue
Dequeque: Remove node from front of queue, return the val
Peek(): Return value of front node
isEmpty(boolean) tells if queue is empty

# Code Challenge 11:
## Collaborated w/ Adrian
# Challenge Summary
Create a new class called pseudo queue.  PseudoQueue class has the two methods , enqueue and dequeue. Enqueue has an argument that is going to be implemented into the queue and remove a value from the queue using dequeue.

## Whiteboard Process
![CC10.png](lib%2Fsrc%2Fmain%2Fjava%2Fcodechallenges%2Flinkedlist%2FWhiteBoarding%2FCC10.png)

## Approach & Efficiency
Working with a partner and research through videos was the approach because it allows us to pick each others brains. The Space complexity is O(n) holding the amount of values given between the two stacks and time is O(1) algo's worst case, stays constant.


## Solution
[Solution Code CC10](https://github.com/snur206/data-structures-and-algorithms/blob/stack-queue-pseudo/java/datastructures/lib/src/main/java/codechallenges/linkedlist/pseudoQueue.java)

# Code Challenge 12:
## Collaborated w/ Adrian and Ryan
# Challenge Summary
Create class called AnimalShelter that holds only cats and doges using FIFO impletmenting the methods enqueue and dequeue.
## Whiteboard Process
![CC12.png](lib%2Fsrc%2Fmain%2Fjava%2Fcodechallenges%2Flinkedlist%2FWhiteBoarding%2FCC12.png)
## Approach & Efficiency
Working with my partners to discuss the challenge and bounce ideas off of each other. The Time complexity is O(n) because the queue stays constant. The Space complexity is O(1) because it is holding values from the queue that needs no extra space that is required.

## Solution
[Solution Code CC12](https://github.com/snur206/data-structures-and-algorithms/blob/stack-queue-pseudo/java/datastructures/lib/src/main/java/codechallenges/linkedlist/animal/animalShelter.java)

# Code Challenge 13:
## Collaborated w/ Adrian and Ryan
# Challenge Summary

Write a function called validate brackets that takes a string argument and return a boolean. Three types of brackets, Round Brackets: (), Square Brackets: [], and Curly Brackets: {}.

## Whiteboard Process
![CC13.png](lib%2Fsrc%2Fmain%2Fjava%2Fcodechallenges%2Flinkedlist%2FWhiteBoarding%2FCC13.png)
## Approach & Efficiency
Researching on the brackets  The Time complexity is O(n) because we are running a loop. The Space complexity is O(1) because the space is not increasing.

## Solution
[Solution Code CC13](https://github.com/snur206/data-structures-and-algorithms/blob/stack-queue-pseudo/java/datastructures/lib/src/main/java/codechallenges/linkedlist/brackets/Brackets.java)

# Code Challenge: Trees
A data structure where nodes are organized by root, left, or right depending if the order is either preOrder, inOrder, or postOrder.
## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a Binary Tree class that takes three methodes (pre, in, post orders) that returns an array of values ordered appropriately.
Create a Binary Search Tree class that takes the methods add with value as its argument and returns nothing. Adds a new node with that value in the correct location in the binary search tree.
Contains is the other method that has value as its argument and returns a boolean indicating whether or not the value is in the tree at least once.
Tests:
Can successfully instantiate an empty tree
Can successfully instantiate a tree with a single root node
For a Binary Search Tree, can successfully add a left child and right child properly to a node
Can successfully return a collection from a preorder traversal
Can successfully return a collection from an inorder traversal
Can successfully return a collection from a postorder traversal
Returns true	false for the contains method, given an existing or non-existing node value

## Approach & Efficiency
BST and Binary tree  has the complexity time of O(h) depends on the height of the tree or for BST O(n) because the tree is increasing and the space O(w) depends on the width of the tree.
## API
### Binary Tree
public Object[] preOrderTraversal(): Root will be looked at first, then goes left, and will check right last. Root, Left, Right
public Object[] inOrderTraversal(): Left will be looked at first, then goes root, and will check right last. Left, Root, Right
P public Object[] postOrderTraversal(): Left will be looked at first, then goes right, and will check root last. Left, Right, Root
### Binary Search Tree
public void add(T value): Adds new node with the value in the right spot.
public boolean contains (T value): Returns false when the value is not in the tree at least once.

