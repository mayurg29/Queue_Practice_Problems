import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
//    Creating a Queue of 56->30->70 using LinkedList
    @Test
    void given3NosWhenQueuedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
    }

//    Deleting element from the beginning of queue
    @Test
    void given3NosDequeuedFirstElementOfQueue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode dequeue = myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode,dequeue);
    }
}