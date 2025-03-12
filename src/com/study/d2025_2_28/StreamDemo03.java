package study.d2025_2_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");
        //long count=list.stream().count();
        String[] arr={"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"};
        long count=Arrays.stream(arr).count();
        System.out.println(count);









    }
}
