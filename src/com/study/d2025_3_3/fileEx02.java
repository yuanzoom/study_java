package study.d2025_3_3;

import java.io.File;

public class fileEx02 {
/*
    #### 查找文件（不考虑子文件夹）
 定义一个方法找某一个文件夹中，
 是否有以avi结尾的电影（暂时不需要考虑子文件夹）
*/
    public static void main(String[] args) {
        File file=new File("D:\\data");

        System.out.println(checkAvi(file));
    }
    public static boolean checkAvi(File file){
        String[] str=file.list();
        for (String name:str) {
            if(name.endsWith(".avi")){
                return true;
            }
        }
        return  false;
    }
}
