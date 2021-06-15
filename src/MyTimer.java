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
        for (int i = second; i >= 0; i--) {
            System.out.println(minute + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (minute > 0) {
            for (int i = minute - 1; i >= 0; i--) {
                for (int j = 60; j >= 0; j--) {
                    if (j == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(i + " : " + j);
                        break;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i + " : " + j);
                }
            }
        }
    }
}