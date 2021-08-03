package Object.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 摩西摩西
 * @date 2021/8/3  21:35
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("ping " + "192.168.56.1");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
        String line = null;
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}