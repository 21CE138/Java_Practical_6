package Part_6_5;

public class Main {
    public static void main(String[] args) {
        Producer_Consumer test = new Producer_Consumer();
        Thread producer = new Thread(new Producer(test));
        Thread consumer = new Thread(new Consumer(test));
        producer.start();
        consumer.start();
        System.out.println("This program is created by 21CE138 Yuvrajsinh Solanki");
    }
}
