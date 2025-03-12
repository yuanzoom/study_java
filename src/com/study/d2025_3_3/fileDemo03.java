package study.d2025_3_3;

import java.io.File;

public class fileDemo03 {
    public static void main(String[] args) {
        File file=new File("D:\\data");
        String[] names=file.list();
        for (String name:names) {
            System.out.println(name);
        }
    }
}
