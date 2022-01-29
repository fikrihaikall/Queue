package Drivers;

import Models.Mahasiswa;
import Utils.ArrayQueue;

public class Main {
    public static void main(String[] args) {
            Mahasiswa janeJones = new Mahasiswa("Jane", "Jones", 123);
            Mahasiswa johnDoe = new Mahasiswa("John", "Doe", 4567);
            Mahasiswa marySmith = new Mahasiswa("Mary", "Smith", 22);
            Mahasiswa mikeWilson = new Mahasiswa("Mike", "Wilson", 3245);
            Mahasiswa billEnd = new Mahasiswa("Bill", "End", 78);

            ArrayQueue queue = new ArrayQueue(10);
            queue.add(janeJones);
            queue.add(johnDoe);
            queue.add(marySmith);
            queue.add(mikeWilson);
            queue.add(billEnd);
            //queue.printQueue();

            queue.remove();
            queue.remove();
            //queue.printQueue();

            //System.out.println(queue.peek());
            queue.remove();
            queue.remove();
            queue.remove();
            //queue.remove();

            queue.add(mikeWilson);


            queue.printQueue();

        }
}
