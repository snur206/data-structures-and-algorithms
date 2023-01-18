### 401 Data Structures, Code Challenges
Table reference from akkaben 
| Table of Contents - Data Structures                                    |
| -----------------------------------------------------------------------|
| [Whiteboarding: Array Reversal](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge1.png)
| [Whiteboarding: Array Insert Shift](https://github.com/snur206/data-structures-and-algorithms/blob/array-insert-shift/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge2.png) |
| [Whiteboarding: Binary Search](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge03.png) |
| [Linked List](https://github.com/snur206/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/linkedlist) |
| [Linked List Insertions](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/linkedlist/LinkedList.java) |

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
