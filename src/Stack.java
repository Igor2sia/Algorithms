import java.util.Iterator;

public class Stack<T> {
    private T[] elements;
    private int size;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) {
        if (size == capacity) {
            throw new RuntimeException("Stack is full");
        }
        elements[size++] = element;
    }

    public T pop() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[--size];
    }

    public T peek() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private int currentIndex = size - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public T next() {
            return elements[currentIndex--];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
