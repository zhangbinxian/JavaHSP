package demo06.bx_cha.abstract_;

public class demo05_jobA extends demo05_Template{
    @Override
    public void job() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum+=i;
        }
    }
}
