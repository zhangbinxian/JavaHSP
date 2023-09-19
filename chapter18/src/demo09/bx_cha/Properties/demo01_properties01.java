package demo09.bx_cha.Properties;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_properties01 {
    public static void main(String[] args) throws IOException {

    }

    @Test
    public void readProperties() throws IOException {
        //读取mysql.properties 文件，并得到ip, user 和 pwd
        String path = "./src/demo09/bx_cha/Properties/resource/mysql.properties";

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = null;
        while ((line = br.readLine()) != null) {
            // System.out.println(line);
            String[] splits = line.split("=");
            System.out.println(splits[0] + ": " + splits[1]);
        }
    }
}
