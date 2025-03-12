package study.d2025_3_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioDemo02 {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream fos=new FileOutputStream("b.txt");
       int b=0;
//       while((b=fis.read())!=-1){
//           System.out.println((char)b);
//       }
        byte[] bytes=new byte[2];
//        while((b=fis.read(bytes))!=-1){
//            System.out.println(new String(bytes));
//        }
        while((b=fis.read())!=-1){
           fos.write(b);
        }
        fos.close();
        fis.close();
        long end =System.currentTimeMillis();
        System.out.println(end-start);//33
    }
}
