package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 1, count = 1; i <= lastPrinted; i++) {
            if (count % 3 != 0) {
                System.out.println(i);
            }
            count++;
        }
    }
}
