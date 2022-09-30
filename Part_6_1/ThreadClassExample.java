package Part_6_1;

public class ThreadClassExample extends Thread{
    public void run() {
        System.out.println("Using Thread class :- Hello World");
    }
}
class thread1 implements Runnable {
    public void run() {
        System.out.println("Using Runnable interface :- Hello World");
    }
}

class ThreadDemo_1{
    public static void main(String[] args) {
        ThreadClassExample a = new ThreadClassExample();
        a.start();
        thread1 b = new thread1();
        Thread c = new Thread(b);
        c.start();
        System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
    }
    }
