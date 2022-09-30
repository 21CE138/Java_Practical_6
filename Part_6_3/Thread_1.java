package Part_6_3;

public class Thread_1 extends Thread{
    public void run() {
        for (int i = 0; i < 25; i++) {
            try{
                System.out.println(i);
                sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
class Thread_Demo{
    public static void main(String[] args) {
        Thread_1 a = new Thread_1();
        a.start();
        System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
    }
}
