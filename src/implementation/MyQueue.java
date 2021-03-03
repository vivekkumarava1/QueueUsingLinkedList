package implementation;

import interface1.QueueADT;

public class MyQueue<E> implements QueueADT<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;
    public MyQueue(){
        front = null;
        rear = null;
        size = 0;
    }


    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<>(data);
        if (!isEmpty()){
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }
        size++;

    }

    @Override
    public E dequeue() {
        E response = null;
        if (!isEmpty()){
            response = front.getData();
            front = front.getNext();
            if (front == null){
                rear = null;
            }
            size--;

        }
        else{
            System.out.println("Queue is UnderFlow");
        }
        return null;
    }

    @Override
    public E peek() {
        E response = null;
        if (!isEmpty()){
            response = front.getData();
        }
        return response;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }
    public void traverse(){
        System.out.println("printing elements of queue");
        System.out.print("front <--");
        Node<E> temp = front;
        while (temp != null){
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
        System.out.println("rear");
    }
}


