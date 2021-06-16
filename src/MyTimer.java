public class MyTimer extends Thread {
    private int minute;
    private int second;

    public MyTimer(int minute, int second) {
        if (minute < 0) {
            throw new RuntimeException("Minute can't be negative");
        }
        if (second < 0 || second > 59) {
            throw new RuntimeException("Second must be between 0-60");
        }
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void run() {
        minute += 1;
        do{
            minute -= 1;
            for (int i = second; i >= 0; i--) {
                System.out.println(minute + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            second = 60;
        }
        while(minute != 0);
    }
}