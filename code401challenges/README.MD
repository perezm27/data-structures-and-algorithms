# Code Challenge 01 : Reverse an Array
A short Java program that reverses an array.

## Challenge
The challenge was to define a method which takes in an array of integers and returns that array in descending order.

## Approach & Efficiency
- [x] Write a method that takes in an array of integers as argument
- [x] Instantiate a new array of integers to hold our reversed values
- [x] iterate through input array in reverse order with reverse for loop
- [x] assign reversed values into output Array at the reversed index subtracted by i
- [x] return output array  

## Collaborative Efforts
Padmapriya Ganapathi

## Solution
![Image description](assets/array_reverse.jpg)


# Code Challenge 02 : Shift Array

## Challenge
Write a function called insertShiftArray which takes in an array and the value to be added.
Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency
- [x] Create new Array that can hold the old array plus the intended added element
- [x] Create new variable to keep track of indexes.
- [x] Determine middle index that the new element will be added to
- [x] Iterate through input array
- [x] Check when the index of the array is at our target index
- [x] Insert new element
- [x] Increment index variable
- [x] Assign old array to the new array at the index outlined by our countOfIndex variable.
- [x] Increment index variable
- [x] Return new Array

## Collaborative Efforts
Matt Stuhring  
Peter Lee

## Solution
![Image description](assets/challenge2Whiteboard.jpg)

# Code Challenge 03 : Binary Search

## Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. 
Without utilizing any of the built-in methods available to your language, return the index of the array’s 
element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
- [x] Write a function that takes in the sorted array and the search key.
- [x] Create variables to keep track of min index, max index and the midpoint which is the length of array / 2
- [x] Make a comparison starting at the midpoint and cut the size of the array depending on the value of the key
- [x] return the index of the element which contains our key
- [x] return -1 is element does not exist

## Collaborative Efforts
Travis Cox  

## Solution
![Image description](assets/BinarySearch.jpg)

# Code Challenge 06 : Linked list Insertions

## Challenge
Write the following methods for the Linked List class:

* .append(value) which adds a new node with the given value to the end of the list
* .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
* .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node


## Approach & Efficiency
O(n) time complexity for this data structure with O(1) space.

## Collaborative Efforts
Kevin Couture  

## Solution
![Image description](assets/ll-insertions.jpg)

# Code Challenge 07 : Linked list k-th position from end Insertion

## Challenge
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. 

## Approach & Efficiency
O(n) time complexity for this data structure with O(1) space.

## Code Challenge 08 : Merging two Linked Lists
Merge two linked lists.

## Challenge 
Write a function called mergeLists which takes two linked lists as arguments. 
Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. 
Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Approach & Efficiency
* Complexity : O(n)  
* Space : O(1)

## Solution
![Image description](assets/MergeLL.jpg)

## Collaborative Efforts
[Bomi Bear](https://github.com/bomibear)


# Code Challenge 11 : Implement a Queue With Two Stacks

## Challenge
Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects.   
Ensure that you create your class with the following methods:  

enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.  
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.  
The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

## Approach & Efficiency
* Complexity : O(n)  
* Space : O(1)

## Solution
![Image description](assets/QueueWithStacks.JPG)

# Code Challenge 12 : First-in, First out Animal Shelter.

## Challenge
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

## Approach & Efficiency
* String Builder - Complexity : O(n)  
* Enqueue O(1)
* Dequeue O(1)
* Peek O(1)
* Space : O(1)

## Solution
![Image description](assets/AnimalShelter.JPG)

## Collaborative Efforts
* Renee Messick
* Matt Stuhring
* Nick Paro


