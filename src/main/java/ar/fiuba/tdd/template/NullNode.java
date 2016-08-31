package ar.fiuba.tdd.template;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class NullNode<T> implements INode<T> {

    private INode<T> finalNode;

    public NullNode(INode<T> finalNode) {
        this.finalNode = finalNode;
    }

    public void connectToEnd(INode<T> otherNode) {
        this.finalNode.setNextNode(otherNode);
    }

    public INode<T> getNextNode() {
        return this;
    }

    public void setNextNode(INode<T> otherNode) {
        throw new ValueException("Unable to set next node");
    }

    public int countChainNodes() {
        return 0;
    }

    public void store(T item) {
        throw new ValueException("Unable to store an item");
    }

    public T getItem() {
        throw new ValueException("Cannot get any items");
    }

    public INode<T> retroBind(INode<T> otherNode) {
        return (this.finalNode = otherNode);
    }
}
