package demo06.bx_cha.abstract_;

public class demo05_jobB extends demo05_Template {
    @Override
    public void job() {
        int doubleSum = 0;
        for (int i = 0; i < 1000000; i++) {
            doubleSum += (2 * i);
        }
    }
}
