package Part_6_2;

public class Main {
    public static void main(String[] args) {
        Even_Number a = new Even_Number();
        Odd_Number b = new Odd_Number();

        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);
        a1.start();
        b1.start();
        System.out.println("This program is created by 21CE138 Yuvrajsinh Solanki");
    }
}
