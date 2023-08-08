package demo07.bx_cha.interface_;

public class demo06_interfacePolyPass {
    public static void main(String[] args) {
        // 动态传递现象

        // 接口类型的变量指向，实现了该接口的1类和对象实例
        IG ig= new Teacher();
        // 如果IG继承了IH接口，而Teacher类实现了IG接口
        // 那么Teacher相当于也实现了IH接口
        IH ih= new Teacher();
    }
}
interface IH{}
interface IG extends IH{}

class Teacher implements IG{

}
