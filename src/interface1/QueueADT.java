package interface1;

public interface QueueADT<E> {
    void enqueue(E data);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();


}
