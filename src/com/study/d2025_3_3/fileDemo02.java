package study.d2025_3_3;

import java.io.File;

public class fileDemo02 {
    public static void main(String[] args) {
        File file=new File("D:\\data\\My前端项目\\项目一\\avatar.jpg");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
