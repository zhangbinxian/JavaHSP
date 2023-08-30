package demo07.bx_cha.System;

import java.util.Arrays;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_System {
    public static void main(String[] args) {
        // arraycopy 复制数组元素，比较适合底层调用，一般使用Arrays.copyOf
        int[] src = {1, 2, 3};
        // dest当前状态{0,0,0,0,0};
        int[] dest = new int[5];
        // * @param      src      原数组
        // * @param      srcPos   从原数组的哪个index开始拷贝
        // * @param      dest     目标数组
        // * @param      destPos  从目标数组的哪个index开始拷贝
        // * @param      length   拷贝的长度
        System.arraycopy(src, 0, dest, 2, 3);
        System.out.println(Arrays.toString(dest));


    }
}
