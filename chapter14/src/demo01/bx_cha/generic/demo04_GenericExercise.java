package demo01.bx_cha.generic;

import java.util.*;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_GenericExercise {
    public static void main(String[] args) {
        // 创建 3 个学生对象
        // 放入到 HashSet 中学生对象, 使用
        // 放入到 HashMap 中，要求 Key 是 String name, Value 就是 学生对象
        // 使用两种方式遍历

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("stu1", 20));
        studentHashSet.add(new Student("stu2", 21));
        studentHashSet.add(new Student("stu3", 22));


        for (Student student : studentHashSet) {
            System.out.println(student);
        }

        System.out.println("=============================");


        HashMap<String, Student> studentHashMap = new HashMap<>();
        /*
            public class HashMap<K,V> {}
         */
        studentHashMap.put("stu4", new Student("stu4", 19));
        studentHashMap.put("stu5", new Student("stu5", 19));
        studentHashMap.put("stu6", new Student("stu6", 19));
        //迭代器 EntrySet
        /*
        public Set<Map.Entry<K,V>> entrySet() {
            Set<Map.Entry<K,V>> es;
            return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
        }
        */


        Set<Map.Entry<String, Student>> entrySet = studentHashMap.entrySet();
        /*
        public final Iterator<Map.Entry<K,V>> iterator() {
        return new EntryIterator();
        }
        */
        Iterator<Map.Entry<String, Student>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> studentEntry = iterator.next();
            System.out.println(studentEntry.getKey() + "-" + studentEntry.getValue());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}