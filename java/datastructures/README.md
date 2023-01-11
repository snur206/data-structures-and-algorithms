# 401 Code Challenges:

### 401 Data Structures, Code Challenges
Table reference from akkaben
| Table of Contents - Data Structures                                    |
| -----------------------------------------------------------------------|
| [Whiteboarding: Array Reversal](https://github.com/snur206/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge1.png)
| [Whiteboarding: Array Insert Shift](https://github.com/snur206/data-structures-and-algorithms/blob/array-insert-shift/java/datastructures/lib/src/main/java/codechallenges/linkedlist/WhiteBoarding/codeChallenge2.png) |



# Code Challenge 2:

# Insert to Middle of an Array
Write a function called insertShiftArray which takes in an array and a value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Whiteboard Process
<img width="1107" alt="Screenshot 2023-01-11 at 9 22 39 AM" src="https://user-images.githubusercontent.com/115438182/211879883-8e23a8ea-2a15-44a6-a740-b47644c3f07b.png">
## Approach & Efficiency
Approach was to set values for the first index and last in the array. If the key value pair was greater compared to the value in the midpoint that it is being tested, to add it infront of the value. Using Time O(n) because it is linear and going through each array value and Space O(n) to reate an array with added size +1.
