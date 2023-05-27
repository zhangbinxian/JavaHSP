public class demo04 {
    public static void main(String[] args) {
        A a = new A();
        int[] res = a.getAddSub(10, 5);
        System.out.println("n1+n2=" + res[0]);
        System.out.println("n1-n2=" + res[1]);

        a.print();
        a.printN(10);
        a.print2(100);

        System.out.println();
        B b = new B();
        b.printA();
    }
}

class A {
    public void printN(int n) {
        System.out.println(n);
    }

    public void print() {
        System.out.println("调用了print方法");
        //void没有返回值,但是可以写return;
        return;
    }

    public void print2(int n) {
        printN(n);
        //同类调用不用创建对象,可以调用方法，但不能创建方法
        System.out.println("print2调用了print(n)");

        // 方法当中可以调用方法，但不能创建方法体
        /*
        public void print3(){
            System.out.println("print3");
        }
        */
    }

    public int[] getAddSub(int n1, int n2) {
        int[] res = new int[2];
        res[0] = n1 + n2;
        res[1] = n1 - n2;
        //一共方法只返回一共返回值，但一共返回值可以是多个值(数组)
        return res;

    }
}

class B {
    public void printA() {
        //在B类当中调用A类方法时，要创建对象A;
        //通过对象名调用
        System.out.println("在B当中调用了A类的printN(n),n=100");
        A Ba = new A();
        Ba.printN(100);

    }
}
