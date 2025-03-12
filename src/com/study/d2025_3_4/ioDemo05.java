package study.d2025_3_4;

import java.io.*;

public class ioDemo05 {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        //字节缓冲输入流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("a.txt"));
        //字节缓冲输出流
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("c.txt"));
        int n=0;
        while ((n=bis.read())!=-1){
            bos.write(n);
        }
        bos.close();
        bis.close();
        long end =System.currentTimeMillis();
        System.out.println(end-start);//2
    }
}
