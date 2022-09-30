package Part_6_2;

import java.util.Random;

class Random_Number{
    static Random R = new Random();
    static int[] a = new int[15];
    static{
        for (int i = 0; i < 15; i++) {
            a[i] = R.nextInt(100);
        }
    }
}
class Even_Number extends Random_Number implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            if(i%2==0){
                System.out.println("[a"+i+"]"+a[i]);
            }
        }
    }
}
class Odd_Number extends Random_Number implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            if(i%2!=0){
                System.out.println("[a"+i+"]"+a[i]);
            }
        }
    }
}
