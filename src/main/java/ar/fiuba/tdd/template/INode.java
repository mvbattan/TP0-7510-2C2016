package ar.fiuba.tdd.template;

public interface INode<T> {
    void store(T item);
    void setNextNode(INode<T> otherNode);
    int countChainNodes();
    INode<T> getNextNode();
    T getItem();
    void connectToEnd(INode<T> otherNode);
    INode<T> retroBind(INode<T> otherNode);
}
