package Pp_T04_DmDev.Pp_L02_01_08;

public class Main {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(3750);
        timeInterval1.getTime();

        TimeInterval timeInterval2 = new TimeInterval(1, 2, 30);
        timeInterval2.getTime();

        timeInterval2.allSeconds();

        TimeInterval timeInterval3 = new TimeInterval(timeInterval1.sumTimeInterval(timeInterval2).allSeconds());
        timeInterval3.getTime();

    }
}
