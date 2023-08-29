package demo04.bx_cha.StringBuilder;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        long startTime = 0L;
        long endTime = 0L;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer执行时间=" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder执行时间=" + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String执行时间=" + (endTime - startTime));
    }
}
