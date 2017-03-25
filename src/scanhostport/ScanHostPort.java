package scanhostport;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ScanHostPort {

    private Socket s;
    private String ip;

    //แสกนแบบ Remote
    public ScanHostPort() {
        //for (int i = 0; i < 65535; i++) { //อันนี้คือ check ทุกค่า แต่ไม่จำเป็นต้องหาทั้งหมด
        for (int i = 0; i < 136; i++) {
            try {
                ip = "127.0.0.1";
                s = new Socket(ip, i);
                System.out.println("Remote host open port : " + i);
            } catch (IOException ioe) {
                //System.out.println("Localhost open port : " + i);
            }

        }

    }

    public static void main(String[] args) {
        new ScanHostPort();
    }

}
