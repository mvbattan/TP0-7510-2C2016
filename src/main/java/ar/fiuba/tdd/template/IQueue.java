package ar.fiuba.tdd.template;

public interface IQueue<T> {
    boolean IsEmpty();
    int size();
    void add(T item);
    T top();
    void remove();
}
