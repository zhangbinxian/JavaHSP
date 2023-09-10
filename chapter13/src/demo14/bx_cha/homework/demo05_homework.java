package demo14.bx_cha.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo05_homework {
    public static void main(String[] args) {


        HashSet set = new HashSet();//ok
        Person p1 = new Person(1001, "AA");//ok
        Person p2 = new Person(1002, "BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";

        set.remove(p1);
        //remove也需要根据hash，但是（AA,1001）,更改为(CC,1001)之后，计算的hash与之前不同，所以不能删除成功
        System.out.println(set.remove(p1));
        System.out.println(set);//2

        // (1001,CC)计算的hash与p1,p2不同，可以添加成功
        set.add(new Person(1001, "CC"));
        System.out.println(set);//3

        // (1001,AA)计算的hash与p1,p2不同，且p1更改为(1001,CC)hash也不同，可以添加成功
        set.add(new Person(1001, "AA"));
        System.out.println(set);//4

    }
}

/**
 * hash index 都是假想的
 * p1(1001, "AA") hash=0001 table[index]=1
 * p2(1002, "BB") hash=0002 table[index]=2
 *
 * p1.name="CC"  hash=0003 table[index]=3
 * remove(p1(1001,"CC")) 找不到，因为p1在table[1],单需要remove的位置是table[3]
 *
 * add(p3(1001, "CC")) hash=0003 table[index]=3 ,可以成功添加
 *
 * add(p4(1001, "AA")) hash=0001 table[index]=1,和p1比较hashcode相同(因为原本的p1没有修改为CC，的hash=0001，)
 * equals不同(p1.name=CC,p4.name=AA)，结果不同，所以加在p1的后面
 *
 */

class Person {
    public String name;
    public int id;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

