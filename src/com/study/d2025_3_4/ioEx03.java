package study.d2025_3_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ioEx03 {
    /*文本文件中有以下的数据：
                2-1-9-4-7-8
 将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
                */
    public static void main(String[] args) throws IOException {
//        File file=new File("a.txt");
//        file.createNewFile();
//        FileWriter fos=new FileWriter("a.txt");
//        fos.write("2-1-9-4-7-8");
//        fos.close();
        FileReader fr=new FileReader("a.txt");
        StringBuilder sb=new StringBuilder();
        int f=0;
        while((f=fr.read())!=-1){
            sb.append((char)f);
        }
        fr.close();
        String str=sb.toString();
        String[] s=str.split("-");
        ArrayList<Integer> list=new ArrayList<>();
        for (String a:s) {
            list.add(Integer.parseInt(a));
        }

        Collections.sort(list);
        FileWriter fw=new FileWriter("a.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
             fw.write(list.get(i)+"");
            }else{
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
