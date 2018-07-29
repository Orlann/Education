package com.boostbrain.genericsLesson15;

public class CustomArrayList<T> {
    private Object[] data = new Object[0];
    private int length;

    public void add(T element) {
        if (length == data.length) {
            Object[] newData = new Object[data.length * 2 + 1];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
//             System.arraycopy(data, 0, newData,0,data.length));       array copy function
            data = newData;
        }
        data[length] = element;
        length++;
    }

    public T get(int index) {
        if (index >= length || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) data[index];
    }

    public int getLength() {
        return length;
    }
}
