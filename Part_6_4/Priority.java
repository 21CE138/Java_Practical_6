package Part_6_4;

public class Priority extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
class ThreadPriority{
    public static void main(String[] args) {
        Priority First = new Priority();
        Priority Second = new Priority();
        Priority Third = new Priority();
        First.setPriority(3);
        Second.setPriority(Thread.NORM_PRIORITY);
        Third.setPriority(7);
        System.out.println("First Thread Priority :- "+First.getPriority());
        System.out.println("Second Thread Priority :- "+Second.getPriority());
        System.out.println("Third Thread Priority :- "+Third.getPriority());
        System.out.println("This program is created by 21CE138 Yuvrajsinh Solanki");
    }
}
