public class demo07_copyObj {
    public static void main(String[] args) {
        demo07_Person p = new demo07_Person();
        p.age = 20;
        p.name = "tom";
        System.out.println(p + " " + p.age + " " + p.name);

        Mytool mytool = new Mytool();
        demo07_Person newpeople = mytool.copy(p);
        System.out.println(newpeople + " " + newpeople.age + " " + newpeople.name);

        //判断p和newpeople是否是同一个对象,返回false,说明p和newpeople不是同一个,是两个独立分开的空间
        System.out.println(p == newpeople);
    }
}

class Mytool {
    public demo07_Person copy(demo07_Person p) {
        demo07_Person p2 = new demo07_Person();
        p2.age = p.age;
        p2.name = p.name;
        return p2;
    }
}

class demo07_Person {
    int age;
    String name;
}