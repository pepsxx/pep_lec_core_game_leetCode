package Pp_T04_DmDev.Pp_L02_01_08;

public class TimeInterval {
    public static final int SECINMIN = 60;
    public static final int SECINHOUR = 3600;
    int hour;
    int minute;
    int seconds;

    public TimeInterval(int seconds) {
        System.out.println("seconds = " + seconds);
        this.hour = seconds / SECINHOUR;
        this.minute = seconds % SECINHOUR / SECINMIN;
        this.seconds = seconds % SECINHOUR % SECINMIN;
        System.out.println("this.hour = " + this.hour);
        System.out.println("this.minute = " + this.minute);
        System.out.println("this.seconds = " + this.seconds);

    }

    public TimeInterval(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
        System.out.println("this.hour = " + this.hour);
        System.out.println("this.minute = " + this.minute);
        System.out.println("this.seconds = " + this.seconds);
    }

    public int allSeconds() {
        return this.seconds + this.minute * SECINMIN + this.hour * SECINHOUR;
    }

    public TimeInterval sumTimeInterval(TimeInterval timeInterval) {
        int sum = this.allSeconds() + timeInterval.allSeconds();
        return new TimeInterval(sum);
    }

    public void getTime() {
        System.out.println(this.hour + "h  " + this.minute + "m  " + this.seconds + "s");
        System.out.println();
    }
}
