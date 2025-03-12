package study.d2025_3_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ioEx04 {
    /*
    1. 逐行读取文本信息。
    2. 把读取到的文本存储到集合中
    3. 对集合中的文本进行排序
    4. 遍历集合，按顺序，写出文本信息。
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
        ArrayList<String> list=new ArrayList<>();
        String line="";
        while((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
