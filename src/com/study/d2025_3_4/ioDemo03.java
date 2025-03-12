package study.d2025_3_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class ioDemo03 {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("C:\\Users\\31980\\Pictures\\相机\\1.jpg");
        FileOutputStream fos=new FileOutputStream("copy1.jpg");
        int b=0;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        Date date=new Date();
        date.setTime(end-start);
        System.out.println(date);
    }
}
