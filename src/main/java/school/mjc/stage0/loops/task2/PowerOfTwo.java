package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int cnt = 0;
        while (power > 0) {
            if ((power & 1) == 1) {
                cnt++;
            }
            power = power >> 1;
            System.out.println(cnt);
        }
    }
}
