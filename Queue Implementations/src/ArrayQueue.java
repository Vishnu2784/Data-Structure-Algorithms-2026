import java.sql.SQLOutput;
import java.util.*;


public class ArrayQueue {
    private int[] Array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.Array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }
    public void size(){
        System.out.println(size);
    }


    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        } else {
            rear++;
            Array[rear] = item;
            size++;


        }


    }

    private boolean isFull() {
        return  size == capacity;
    }
    private boolean isEmpty(){
        return size==0;
    }

    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");

        }
        int item =Array[front];
        front++;
        size--;
        System.out.println("Last element removed "+ item);
    }


    public void peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int item=Array[front];
        System.out.println("the peek elemnt is "+Array[front]);

    }


    public void display(){
        if(isEmpty()){

            System.out.println("Queue is Empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(Array[i]+"  ");
            }
            System.out.println();
        }
    }


}
