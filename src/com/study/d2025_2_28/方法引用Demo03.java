package study.d2025_2_28;

import java.util.ArrayList;
import java.util.Collections;

public class 方法引用Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","张无","张翠山","王二麻子","张良","谢广坤");
        list.stream().filter(new 方法引用Demo03()::test).forEach(s->System.out.println(s));

    }
    public boolean test(String s){
        return s.startsWith("张")&&s.length()==3;
    }
}
