package study.d2025_3_3;

import java.io.File;
import java.io.IOException;

public class fileEx01 {
//    在当前模块下的aaa文件夹中创建一个a.txt文件
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\aaa\\a.txt");
        System.out.println(file.createNewFile());
    }
}
