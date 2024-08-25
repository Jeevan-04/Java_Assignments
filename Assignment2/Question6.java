package Assignment2;

public class Question6 {
    private int hr, min, sec;

    public Question6() {
        this.hr = 12;
        this.min = 0;
        this.sec = 0;
    }

    public Question6(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public Question6(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        this.hr = (secondsSinceMidnight / 3600) % 24;
        this.min = (secondsSinceMidnight / 60) % 60;
        this.sec = secondsSinceMidnight % 60;
    }

    public void tick() {
        setClock((hr * 3600 + min * 60 + sec + 1) % 86400);
    }

    public void tickDown() {
        setClock((hr * 3600 + min * 60 + sec - 1 + 86400) % 86400);
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }

    public static void main(String[] args) {
        Question6 time1 = new Question6();
        time1.displayTime();

        Question6 time2 = new Question6(5, 45, 23);
        time2.displayTime();

        Question6 time3 = new Question6(55555);
        time3.displayTime();

        time3.tick();
        time3.displayTime();

        time3.tickDown();
        time3.displayTime();
    }
}

