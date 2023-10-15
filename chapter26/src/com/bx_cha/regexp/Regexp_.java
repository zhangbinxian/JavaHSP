package com.bx_cha.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 韩顺平
 * @version 1.0
 * 体验正则表达式的威力，给我们文本处理带来哪些便利
 */
public class Regexp_ {
    public static void main(String[] args) {

        String content = "私有地址（Private address）属于非注册地址，专门为组织机构内部使用。\n" +
                "以下列出留用的内部私有地址\n" +
                "A类 10.0.0.0--10.255.255.255\n" +
                "B类 172.16.0.0--172.31.255.255\n" +
                "C类 192.168.0.0--192.168.255.255";

        //提取文章中所有的英文单词
        //提取文章中所有的数字
        //提取文章中所有的英文单词和数字
        //提取百度热榜 标题
        //(1). 传统方法. 使用遍历方式，代码量大，效率不高
        //(2). 正则表达式技术

        //1. 先创建一个Pattern对象 ， 模式对象, 可以理解成就是一个正则表达式对象
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //Pattern pattern = Pattern.compile("[0-9]+");
        //Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        //Pattern pattern = Pattern.compile("<a target=\"_blank\" title=\"(\\S*)\"");
        // Pattern pattern = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+");
        //2. 创建一个匹配器对象
        //理解： 就是 matcher 匹配器按照 pattern(模式/样式), 到 content 文本中去匹配
        //找到就返回true, 否则就返回false
        int no = 0;
        Matcher matcher = pattern.matcher(content);
        //3. 可以开始循环匹配
        while (matcher.find()) {
            //匹配内容，文本，放到 m.group(0)
            System.out.println("找到: " + (++no) + " " +matcher.group(0));
        }



    }
}
