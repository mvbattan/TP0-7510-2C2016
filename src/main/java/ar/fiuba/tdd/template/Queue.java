package ar.fiuba.tdd.template;

public class Queue<T> implements IQueue<T> {

    private FirstNode<T> firstNode;

    public Queue() {
        this.firstNode = new FirstNode<T>();
    }

    public void add(T item) {
        this.firstNode.connectToEnd(new ElementNode<T>(item));
    }

    public int size() {
        return this.firstNode.countChainNodes();
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public T top() {
        return this.firstNode.getItem();
    }

    public void remove() {
        this.firstNode.consume();
    }
}
