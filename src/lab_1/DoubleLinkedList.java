package lab_1;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {



    private Node<T> head; // Ссылки на первый и последний узлы в списке
    private Node<T> tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void addToTail(T data) { // Метод добавляет новый узел в конец списка
        Node<T> newNode = new Node<>(data); // Создаём новый объект Node с данными data
        if (head == null) { // если список пуст устанавливаем head и tail в новый узел
            head = newNode;
            tail = newNode;
        } else { // В противном случае устанавливаем ссылку next текущего узла tail в новый узел, а ссылку prev нового узла в текущий узел tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addToHead(T data) { // Метод добавляет новый узел в конец списка
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void remove(T data) { // Метод удаляет первую встречу узла с данными data из списка
        Node<T> current = head;
        while (current != null) { // Проходимся через список начиная с головы
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                } // Когда находим узел с данными data, обновляем ссылки prev и next соседних узлов, чтобы пропустить узел, который будет удален
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public void removeHead() { //Удаление с головы списка
        Node<T> current = head;
        if (current != null) {
            head = current.next;
            head.prev = null;
        }
    }

    public void removeTail() { // Удаление с конца списка
        Node<T> current = tail;
        if (tail != null) {
            tail = current.prev;
            tail.next = null;
        }
    }

    public void edit(T oldData, T newData) { // Этот метод обновляет данные, в списке на новые
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(oldData)) { // Когда находим узел с данными oldData, обновляем поле data этого узла в newData
                current.data = newData;
                return;
            }
            current = current.next;
        }
    }

    public void print() { // Реализовал метод, который проходит по всему списку и печатает строковое представление каждого узла
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public T get(int index) { // Получаем по индексу
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public void set(int index, T data) { // Добавляем по индексу
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.data = data;
                return;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public void removeAt(int index) { // Удаляем по индексу
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkedListIterator();
    }

    private class DoubleLinkedListIterator implements Iterator<T>{
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements in the list");
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public static class Node<T> { // Класс, который представляет отдельный узел в списке
        private T data; // Данные хранящиеся в узле
        private Node<T> prev; // Ссылка на предыдущий узел
        private Node<T> next; // Ссылка на следующий узел

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}