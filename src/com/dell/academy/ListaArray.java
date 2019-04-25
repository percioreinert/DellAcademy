package com.dell.academy;

@SuppressWarnings("unchecked")
public class ListaArray<E> {

    // == constants ==
    private static final int DEFAULT_CAPACITY = 10;

    // == fields ==
    private Object[] list;
    private int size;

    // == constructors ==
    public ListaArray() {
        this.list = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public ListaArray(int initialCapacity) {
        this.list = new Object[initialCapacity];
        this.size = 0;
    }

    // == public methods ==
    public boolean add(E element) {
        if (size == DEFAULT_CAPACITY) {
            return false;
        }
        list[size] = element;
        size++;
        return true;
    }

    public boolean add(E element, int index) {
        if (size == DEFAULT_CAPACITY) {
            return false;
        }
        checkIndex(index, size);
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = element;
        size++;
        return true;
    }

    public E remove(int index) {
        checkIndex(index, size);
        E obj = (E) list[index];
        for (int i = index; i < size - 1; i++) {
            list[index] = list[index + 1];
        }
        size--;
        return obj;
    }

    public E get(int index) {
        checkIndex(index, size);
        return (E) list[index];
    }

    // == private methods ==
    private void checkIndex(int index, int size) {
        if (index < 0 || index > size) {
            throw  new ArrayIndexOutOfBoundsException();
        }
    }
}
