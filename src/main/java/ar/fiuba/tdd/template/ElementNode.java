package ar.fiuba.tdd.template;

public class ElementNode<T> implements INode<T> {

    private INode<T> nextNode = new NullNode<T>(this);
    private T item;

    public ElementNode(T item) {
        store(item);
    }

    @Override
    public INode<T> getNextNode() {
        return this.nextNode;
    }

    @Override
    public void setNextNode(INode<T> otherNode) {
        this.nextNode = otherNode;
    }

    @Override
    public void store(T item) {
        this.item = item;
    }

    @Override
    public int countChainNodes() {
        return 1 + this.nextNode.countChainNodes();
    }

    @Override
    public T getItem() {
        return this.item;
    }

    @Override
    public void connectToEnd(INode<T> otherNode) {
        this.nextNode.connectToEnd(otherNode);
    }

    public INode<T> retroBind(INode<T> otherNode) {
        return this;
    }
}
