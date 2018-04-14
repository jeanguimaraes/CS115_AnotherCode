package edu.ldsbc.Assignment10;


public class NumberHolderModel {

    private int[] numberQueue;
    private int front; //front of queue
    private int back;

    public NumberHolderModel() {
        numberQueue = new int[10];
        front = -1;
        back = 0;
    }

    public int[] getNumberQueue() {
        return numberQueue;
    }

    public int getFirst() {
        return numberQueue[front];
    }

    public void reverseQueue() {
        int[] reversedQueue = new int[10];
        int index = 0;
        for(int i=numberQueue.length; i > 0; i--) {
            reversedQueue[index] = numberQueue[i-1];
            index++;
        }
        numberQueue = reversedQueue;
    }

    public void push(int number) {
        if( (back > front && back == numberQueue.length) ||
                (front > back && back + 2 == front) ) {
            throw new IllegalStateException();
        }
        else {
            numberQueue[back] = number;
            back++;
            front++;
            back %= numberQueue.length + 1;
        }
    }

    public int pop() {
        if(back - 1 == front && front == -1) {
            throw new IllegalStateException();
        }

        int popped = numberQueue[front];
        numberQueue[front] = 0;
        //back =
        front %= numberQueue.length + 1;
        return popped;
    }
}
