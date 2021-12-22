What is Data Structure?
Data structure [DS] is a way of organizing data so that it can be used effectively.
So that later it can be accessed quickly and easily.

Importance:
They are essential ingredients in creating fast and powerful algorithms
They help to manage and organize data
They make code clearer and easier to understand

An Abstract Data type:
An ADA is an abstraction of a data structure which provides only the interface to which data structure must adhere to.
The interface does not give any specific details about how something should be implemented or in what programming language.
What is Data Structure?
It is a way to organize data
After organizing data it becomes easy to process it.
Ex library
Types of DS
Linear and Non Linear
Linear -> they’re arranged sequentially so that each member is connected to its previous and next element. As they’re connected sequentially, it becomes easy to traverse them and usually traversal is a single level
Ex : array, LinkedList, stack , queue
Non- linear - > not in sequence, they’re basically connected to one another through different paths, and as in linear data structure, they were single-level, but in non linear they’re stored in multi-level and as they are multilevel, in order to traverse each element in these non-linear data structure takes some amount of time.
Ex : tree and graph
What is an Algorithm?
An algorithm is a set of instruction to perform a task or to solve a given problem 
Analysis of Algorithm
-	An algorithm is a set of instructions to perform a task or to solve a given problem
-	There are several different algorithms to solve a given problem
-	Analysis of algorithm deals in finding best algorithm which runs fast and takes in less memory
Algorithm is decided based on the time and space complexity
To find the time and space complexity, we use an external or a special tool to determine
Asymptotic analysis of an Algorithm
-	Used to determine the time and space complexity
-	Asymptotic analysis helps in evaluating performance of an algorithm in terms of input size and its increase
-	Using asymptotic analysis we don’t measure actual running time of algorithm
-	It helps in determining how time and space taken by algorithm increases with input size 
What are Asymptotic Notations?
-	Asymptotic Notations are the mathematical tools used to describe the running time of an algorithm in terms of the input size
-	Ex: performance of car in 1ltr of petrol
It helps in determining – best case
		Average case and the worst case of an algorithm 
Types of Asymptotic Notations
There are 3 notations for performing runtime analysis of an algorithm 
1.	Omega Notation – Ω
2.	Big O notation
3.	Theta Notation
1.	Omega Notation – it is a formal way to express the lower bound of an algorithm running time 
-	It gives the lower bound of an algorithm 
-	Lower bound means – for any given input this notation determines best amount of time an algorithm can take to complete 
-	This notation will tell the information what the minimum resources we need to run this algorithm 
-	Provides best case analysis of an algorithm 
-	
Ex: if we say certain algorithm takes 100 secs as best amount of time. So, 100 secs will be lower bound of that algorithm. The algorithm can take more than 100 secs but it will not take less than 100 secs

Big O Notation :
-	this notation express the upper bound of an algorithm running time 
-	Upper bound means for any given input this notation determines longest amount of time an algorithm can take to complete 
-	This is opposite of omega notation
-	Provides the worst case analysis of an algorithm 
Ex: if we say certain algorithm takes 100 secs as longest amount of time. So, 100 secs will be upper bound of that algorithm. The algorithm can take less than 100 secs but it will not take more than 100 secs 
Theta Notation:
-	It is a formal way to express both the upper and lower bound of an algorithm’s running time
-	By lower and upper bound means for any given input this notation determines average amount of time an algorithm can take to complete
Ex: if we run certain algorithm and it takes 100 secs for first run, 120 secs for second run, 100 for third run and so on. So, theta notations gives an average of running time of that algorithm
Analysis of time complexity in Big O notation:
-	It provides an upper bound of an algorithm running time
-	Upper bound means longest amount of time an algorithm can take to complete 
Rules of Big O notation
-	It’s a single processor 
 Calculating Time complexity of an algorithm 
 
In the first img – operations used are 
input x = 1 operation
input y = 1 operation
input x+y = 1 operation
result = 1 operation 
2 => so total = 1+1+1+1 operation 
result = 1 operation
return value = 1 operation 
3=> 1+1 operation
In the Second img – operations used are
Only one arr[i] no matter how many array values are there it will take the same amount of time
Time complexity of linear algorithm
 
We ignore the lower values and the constant next to n  , so T = O(n)
Time complexity of polynomial algorithm
 
 

We ignore the lower values and the constant next to n or n^2 , so T = O(n^2)



Singly LinkedList
How to represent singly LinkedList in Java
-	Singly Linked List is a data structure used for storing collection of nodes and has following properties
o	It contains sequence of nodes
o	A node has a data and reference to next node in a list
o	First node is the head node
o	Last node has data and points to null

List Node
								Null

Head
 											       Null	Null
 




Implementation of a ListNode in a singly LinkedList
// Generic Type
public class ListNode<T> {
		private T data;
		private ListNode<T> next;
	}
//IntergerType
	public class ListNode {
		private int data;
		private ListNode next;
	}
 
 
How to implement SinglyLinkedList in java
 
By default class SinglyLinkedList internally contains ListNode
 
Creating SinglyLinkedList in Java
 

How to print elements of a singly linked List in java
