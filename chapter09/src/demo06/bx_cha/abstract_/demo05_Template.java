package demo06.bx_cha.abstract_;

abstract public class demo05_Template {


    // 抽象方法
    public abstract void job();

    public void calcTimes() {
        long start = System.currentTimeMillis();
        // 用到了job方法
        job();
        long end = System.currentTimeMillis();
        System.out.println("当前code耗时" + (end - start));
    }
}
