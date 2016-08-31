package ar.fiuba.tdd.template;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class FirstNode<T> implements INode<T> {

    private INode<T> nextNode;

    public FirstNode() {
        this.nextNode = new NullNode<T>(this);
    }

    public T getItem() {
        return this.getNextNode().getItem();
    }

    public void setNextNode(INode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public INode<T> getNextNode() {
        return this.nextNode;
    }

    public void store(T item) {
        this.getNextNode().store(item);
    }

    public void connectToEnd(INode<T> otherNode) {
        this.nextNode.connectToEnd(otherNode);
    }

    public int countChainNodes() {
        return 0 + this.getNextNode().countChainNodes();
    }

    public void consume() {
        this.nextNode = this.nextNode.retroBind(this).getNextNode();
    }

    public INode<T> retroBind(INode<T> otherNode) {
        throw new ValueException("Cannot retro bind a first node");
    }
}
