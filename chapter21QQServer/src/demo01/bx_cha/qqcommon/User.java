package demo01.bx_cha.qqcommon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 表示一个客户信息
 */

// 使用lombok插件，免除类其他方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    // 增强兼容性，添加serialVersionUID
    private static final long serialVersionUID = 1L;

    private String userId;
    private String password;

}
