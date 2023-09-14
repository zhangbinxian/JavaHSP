package demo03.bx_cha.exit;

/**
 * @author bx_cha
 * @version 1.0
 *
 * 线程停止
 */
public class demo01_Exit {
    public static void main(String[] args) throws InterruptedException {

        T t = new T();
        t.start();


        //如果希望main线程去控制t1 线程的终止, 必须可以修改 loop
        //让t 退出run方法，从而终止 t线程 -> 通知方式

        //让主线程休眠 10 秒，再通知 t1线程退出
        System.out.println("main线程休眠10s...");
        Thread.sleep(10 * 1000);
        t.setLoop(false);

    }
}

class T extends Thread {

    private boolean loop=true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程正在运行");
        }
    }
}
