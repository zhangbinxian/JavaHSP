package demo01.bx_cha.qqcommon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 表示消息对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Message implements Serializable {
    // 增强兼容性，添加serialVersionUID
    private static final long serialVersionUID = 1L;
    private String sender;//发送者
    private String getter;//接收者
    private String content;//消息内容
    private String sendTime;//发送时间
    private String msgType;//消息类型[可以在接口定义消息类型]

    //进行扩展 和文件相关的成员
    private byte[] fileBytes;
    private int fileLen = 0;
    private String dest; //将文件传输到哪里
    private String src; //源文件路径
}
