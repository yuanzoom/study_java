package study.d2025_1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 爬虫 {
    public static void main(String[] args) throws IOException {
        //创建一个URL对象
        URL url=new URL("https://blog.csdn.net/Tiderty/article/details/144485271");
        //连接上这个网址
        //确保网络畅通
        URLConnection conn=url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line="本质是一个数组，默认数组长度为0，第一次加10的数组大小，" +
                "后面以1.5倍增加数组大小，当第一次添加数据时，" +
                "若小于10，则数组大小为10，若大于10则数组大小与数据大小一致。" +
                "以此类推，当后面添加数据时，增加的数组大小不够时，都是以实际数据大小为准来创建数组的大小";
        //获取正则表达式的值
        String regex="大小";

        Pattern pattern=Pattern.compile(regex);
        //按照pattern的规则去读取当前的这一行信息
        Matcher matcher=pattern.matcher(line);
        //在读取的时候每次读一整行
        //while((line!=null){

            //利用循环获取
            while(matcher.find()){
                String str=matcher.group();
                System.out.println(str);
            }

       // }

    }
}
