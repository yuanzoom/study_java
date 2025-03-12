package study.d2025_3_4;

import java.io.*;

public class ioEx01 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        File file1=new File("D:\\data\\java\\原始文件");
        File file2=new File("D:\\data\\java\\拷贝文件");

        copy(file1,file2);
    }

    public  static  void  copy(File file1,File file2) throws IOException {
        file2.mkdirs();
        File[] files=file1.listFiles();
        for (File f:files) {
            if(f.isFile()){
                FileReader fd=new FileReader(f);
                FileWriter fw=new FileWriter(new File(file2,f.getName()));
                int len;
                char[] c=new char[2];
                while((len=fd.read(c))!=-1){
                    fw.write(c,0,len);
                }
                fw.close();
                fd.close();
            }else{
                copy(f,new File(file2,f.getName()));
            }
        }
    }
}
