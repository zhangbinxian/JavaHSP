package demo08.bx_cha.Map;

import java.util.HashMap;

/**
 * @author bx_cha
 * @version 1.0
 */
public class dmeo07_HashMapSource {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }
        hashMap.put("aaa", "bbb");
        System.out.println("hashMap=" + hashMap);//12 个 k-v
    }
}

class A {

    private int num;

    public A(int num) {
        this.num = num;
    }

    //所有的 A 对象的 hashCode 都是 100
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}