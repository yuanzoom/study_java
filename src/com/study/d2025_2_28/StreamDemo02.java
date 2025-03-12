package study.d2025_2_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean result=s.startsWith("张");
                return result;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        Stream<String> s1= list.stream().skip(2).limit(3);
        Stream<String> s2= list.stream().skip(1).limit(2);
        //Stream.concat(s1,s2).forEach(s->System.out.println(s));
        Stream.concat(s1,s2).distinct().forEach(s->System.out.println(s));


    }
}
