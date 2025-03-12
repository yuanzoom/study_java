package study.d2025_3_4;

import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("a.txt",true);
        fos.write(98);
        byte[] bytes1="\r\n".getBytes();
        fos.write(bytes1);
        byte[] bytes2="程序员".getBytes();
        fos.write(bytes2);
        fos.write(bytes1);
        byte[] bytes3="sbc".getBytes();
        fos.write(bytes3,0,2);
        fos.close();
    }
}
