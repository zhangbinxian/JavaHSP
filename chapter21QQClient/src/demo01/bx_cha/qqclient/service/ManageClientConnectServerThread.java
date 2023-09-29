package demo01.bx_cha.qqclient.service;

import java.util.HashMap;

/**
 * @author bx_cha
 * @version 1.0
 */
public class ManageClientConnectServerThread {
    // 把多个线程放入到一个hashmap集合当中，key是userid，value是线程
    private static HashMap<String, ClientConnectServerThread> hashMap = new HashMap<>();

    // 将某个线程加入到集合
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread ccst) {
        hashMap.put(userId, ccst);
    }

    // 通过userId 可以得到对应的线程
    public static ClientConnectServerThread getThread(String userId) {
        return hashMap.get(userId);
    }
}
