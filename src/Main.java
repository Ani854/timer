import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        MyTimer myTimer = new MyTimer(minute, second);
        myTimer.start();
    }
}