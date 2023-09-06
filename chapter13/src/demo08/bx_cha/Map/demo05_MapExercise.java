package demo08.bx_cha.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo05_MapExercise {
    public static void main(String[] args) {
        /**
         * 使用 HashMap 添加 3 个员工对象，要求
         * 键：员工 id
         * 值：员工对象
         *
         * 并遍历显示工资>18000 的员工(遍历方式最少两种)
         * 员工类：姓名、工资、员工 id
         */

        Map map = new HashMap();
        map.put(1001, new Emp("emp1", 20000, 1001));
        map.put(1002, new Emp("emp2", 2000, 1002));
        map.put(1003, new Emp("emp3", 30000, 1003));


        Set keySet = map.keySet();
        System.out.println("使用增加for");
        for (Object key : keySet) {
            Emp emp = (Emp) map.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(key + "-" + emp);
            }
        }

        System.out.println("使用迭代器");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();

            Emp emp = (Emp) map.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(key + "-" + emp);
            }
        }

        System.out.println("使用entrySet迭代器");
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();

        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            Map.Entry entry = (Map.Entry) next;
            Emp emp = (Emp) entry.getValue();

            if (emp.getSal() > 18000) {
                System.out.println(entry.getKey() + "-" + emp);
            }
        }
    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp() {
    }

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return sal
     */
    public double getSal() {
        return sal;
    }

    /**
     * 设置
     *
     * @param sal
     */
    public void setSal(double sal) {
        this.sal = sal;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Emp{name = " + name + ", sal = " + sal + ", id = " + id + "}";
    }
}

