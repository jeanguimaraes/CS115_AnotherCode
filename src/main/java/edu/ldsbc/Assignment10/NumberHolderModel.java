package edu.ldsbc.Assignment10;

import java.lang.reflect.Array;

public class NumberHolderModel {

    private int[] numberQueue;
    private int front; //front of queue
    private int back;

    public NumberHolderModel() {
        numberQueue = new int[10];
        front = 0;
        back = 1;
    }

    public int[] getNumberQueue() {
        return numberQueue;
    }

    public void reverseQueue() {
        int[] reversedQueue = new int[10];
        int index = 0;
        for(int i=numberQueue.length; i > 0; i--) {
            reversedQueue[index] = numberQueue[i-1];
        }
        numberQueue = reversedQueue;
    }

    public void push(int number) {
        if( (back > front && back == numberQueue.length) ||
                (front > back && back + 2 == front) ) {
            // the queue is full
            throw new IllegalStateException();
        }
        else {
            numberQueue[back] = number;
            back++;
            //if back is greater than numberQueue size, it will go back to 0
            //this is what the video was talking about
            //and the % symbol is the modulus symbol (the assignment calls it "mod")
            back %= numberQueue.length + 1;
        }
    }

    public int pop() {
        //this method is more simple than "push" because pop only removes numbers
        //so we don't need to check if the queue is full
        numberQueue[front] = 0;
        front++;
        front %= numberQueue.length + 1;
        return 0;
    }
}
