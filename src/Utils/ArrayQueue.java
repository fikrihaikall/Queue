package Utils;

import Models.Mahasiswa;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Mahasiswa[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Mahasiswa[capacity];
    }

    public void add(Mahasiswa employee) {
        if (back == queue.length) {
            Mahasiswa[] newArray = new Mahasiswa[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Mahasiswa remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Mahasiswa employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Mahasiswa peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}