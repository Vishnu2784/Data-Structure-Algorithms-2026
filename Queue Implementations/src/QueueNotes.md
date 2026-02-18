ArrayQueue Implementation Notes
📋 Class Overview
A simple queue implementation using arrays with fixed capacity. Follows FIFO (First-In-First-Out) principle.

🏗️ Class Structure
Instance Variables
Variable	Type	Description
Array	int[]	Stores queue elements
front	int	Index of the front element
rear	int	Index of the last element
size	int	Current number of elements
capacity	int	Maximum elements queue can hold
Constructor
java
public ArrayQueue(int capacity)
Initializes queue with specified capacity

Sets front = 0 (points to first element)

Sets rear = -1 (empty queue)

Initializes size = 0

🔧 Methods
Core Operations
1. enqueue(int item)
   Purpose: Adds an element to the rear of the queue

Time Complexity: O(1)

Throws: RuntimeException if queue is full

Process:

Check if queue is full
Increment rear index
Add element at rear position
Increment size
2. dequeue() throws Exception
   Purpose: Removes and returns the front element

Time Complexity: O(1)

Throws: Exception if queue is empty

Process:

Check if queue is empty
Get element at front index
Increment front pointer
Decrement size
3. peek() throws Exception
   Purpose: Views the front element without removing it

Time Complexity: O(1)

Throws: Exception if queue is empty

4. display()
   Purpose: Prints all elements from front to rear

Time Complexity: O(n)

Shows: Elements in FIFO order

Helper Methods
1. isFull()
   Purpose: Checks if queue has reached maximum capacity

Returns: true if size == capacity

2. isEmpty()
   Purpose: Checks if queue contains no elements

Returns: true if size == 0

3. size()
   Purpose: Prints the current number of elements

⚠️ Limitations & Known Issues
Current Limitations
No Circular Behavior: Once rear reaches capacity-1, no more elements can be added even if space is available at the front

Fixed Capacity: Cannot grow dynamically

Wasted Space: After dequeuing elements, front space is not reused

Type Restriction: Only works with integers