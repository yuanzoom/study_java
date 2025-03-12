package study.d2025_3_5;

import java.io.*;

public class ioEx01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("b.txt"));
        int read = br.read();
        br.close();
        read+=1;
        if(read<='3'){
            System.out.println("第"+(char)read+"次登录");
        }else{
            System.out.println("登录超过次数");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
        bw.write(read);
        bw.close();

    }
}
