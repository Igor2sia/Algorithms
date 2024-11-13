package lab_2;
import java.util.EmptyStackException;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private T[] array;
    private int size;

    public Stack(int initialCapacity) {
        array = (T[]) new Object[initialCapacity];
        size = 0;
    }

    public void push(T element) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = element;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return array[--size];
    }

    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return array[size--];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
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
            return array[currentIndex--];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}