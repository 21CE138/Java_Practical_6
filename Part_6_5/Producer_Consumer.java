package Part_6_5;

public class Producer_Consumer {
    int n;
    boolean valueSet = false;
    synchronized int get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        System.out.println("Get value "+n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n) throws InterruptedException {
        while (valueSet) {
            wait();
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put value "+n);
        notify();
    }
}
class Producer implements Runnable{
    Producer_Consumer test;
    public Producer(Producer_Consumer test) {
        this.test = test;
    }
    public void run() {
        int value = 0;
        while (value <= 5) {
            try {
                test.put(value++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable{
    Producer_Consumer test;
    public Consumer(Producer_Consumer test) {
        this.test = test;
    }
    public void run() {
        int i = 0;
        while (i <= 5) {
            try {
                test.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

