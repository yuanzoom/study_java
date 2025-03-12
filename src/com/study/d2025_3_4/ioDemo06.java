package study.d2025_3_4;

import java.io.*;

public class ioDemo06 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader  br=new BufferedReader(new FileReader("a.txt"));
        //字符缓冲输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("d.txt"));

        String n;
        while((n=br.readLine())!=null){
           bw.write(n);
           bw.newLine();
        }
        bw.close();
        br.close();
    }
}
