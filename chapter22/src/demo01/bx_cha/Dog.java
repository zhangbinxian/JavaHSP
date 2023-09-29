package demo01.bx_cha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bx_cha
 * @version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    private String name;

    public void cry() {
        System.out.println("cry");
    }
}
