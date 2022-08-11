import java.net.SocketOption;

public class Main {
    public static void main(String args[]) {
        int amount = 200;
        int percent = 20;
        int bonus = amount * percent / 100;
        System.out.println("Начислено милей: " + bonus);
    }
}