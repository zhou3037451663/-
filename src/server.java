import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Mr.Zhou
 * @Date 2019/12/14
 * @Explain:
 */
public class server {
    public void fuwuqi(){
        try {
            ServerSocket server=new ServerSocket(8888);//建立服务器类(传输端口号)
            Socket incoming=server.accept();//创建服务器对象
            //得到输入输出流
            BufferedReader in=new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            PrintWriter out=new PrintWriter(incoming.getOutputStream(),true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
