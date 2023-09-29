package demo01.bx_cha;

import lombok.Data;

/**
 * @author bx_cha
 * @version 1.0
 */

@Data
public class Cat {
    private String name = "招财猫";
    public int age = 10;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hi() {
        // System.out.println("hi " + name);
    }

    public void cry() {
        System.out.println(name + " 喵喵叫..");
    }
}
