package study.d2025_2_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");

        //利用stream流过滤姓张的和长度为3的
        list.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s->System.out.println(s));

    }
}
