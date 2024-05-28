package queue;

public class ArrayQueue {
	
	private int capacity; // generelle Größe
	private int front;
	private int rear;
	private int[] queue;
	
	public ArrayQueue(int capacity) {
		this.front =0;
		this.rear =0;
		this.capacity = capacity;
		this.queue = new int[capacity];
		
		
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	
	public boolean isEmpty() {
		if(front == rear){
			return true;
			
		}
		return false;
		
		}
	
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	
	/**
	 * Enqueues (adds) an element to the rear of the queue.
	 *
	 * @param element the element to be enqueued
	 * @throws IllegalStateException if the queue is full
	 */
	public void enqueue(int element) {
	    if (!isFull()) {
	        queue[rear] = element;
	        rear++;
	    } else {
	        System.out.println("Queue is Full!");
	    }
	}

	/**
	 * Dequeues (removes) and returns the element from the front of the queue.
	 *
	 * @throws IllegalStateException if the queue is empty
	 * @return the element that was dequeued or -1 if the queue is empty
	 */
	public int dequeue() {
	    if (!isEmpty()) {
	        for (int i = 0; i < rear - 1; i++) {
	            queue[i] = queue[i + 1];
	        }
	        if (rear < capacity) {
	            queue[rear] = 0; // Reset the last element to a default value (optional)
	        }
	        rear--;
	        return queue[front]; // Assuming 'front' is always pointing to the first element
	    } else {
	        System.out.println("Queue is empty!");
	        return -1;
	    }
	}

	/**
	 * Returns the element at the front of the queue without removing it.
	 *
	 * @throws IllegalStateException if the queue is empty
	 * @return the element at the front of thequeue or -1 if the queue is empty
	 */
	public int front() {
	    if (!isEmpty()) {
	        return queue[front]; // Assuming 'front' is always pointing to the first element
	    } else {
	        System.out.println("Queue is empty!");
	        return -1;
	    }
	}

	/**
	 * Displays the content of the queue.
	 */
	public void display() {
	    if (!isEmpty()) {
	        for (int i = 0; i < rear - 1; i++) {
	            System.out.println(queue[i]);
	        }
	    } else {
	        System.out.println("Queue is empty!");
	    }
	}
	
	
}


