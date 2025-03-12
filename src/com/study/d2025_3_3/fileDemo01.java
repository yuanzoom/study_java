package study.d2025_3_3;

import java.util.Date;

public class fileDemo01 {
    public static void main(String[] args) {

        //创建日期对象
        Date d = new Date();

        //public long getTime();获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time):设置时间，给的是毫秒值
        //long time = 1000*60*60;
//        File file=new File("D:\\Typora\\Java");
//        long time=file.lastModified();
//        d.setTime(time);
//        System.out.println(d);

    }
}
