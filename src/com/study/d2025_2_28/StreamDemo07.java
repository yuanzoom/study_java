package study.d2025_2_28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo07 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();
        manList.add("周润发,34");
        manList.add("成龙,78");
        manList.add("刘德华,35");
        manList.add("吴京,57");
        manList.add("周星驰,46");
        manList.add("李连杰,69");
        womanList.add("林心如,35");
        womanList.add("张曼玉,43");
        womanList.add("林青霞,32");
        womanList.add("柳岩,45");
        womanList.add("林志玲,67");
        womanList.add("王祖贤,35");

        Stream<String> s1 = manList.stream().filter(s ->
                s.split(",")[0].length() == 3
        ).limit(2);

        Stream<String> s2 = womanList.stream().filter(s ->
                s.split(",")[0].startsWith("林")
        ).skip(1);

      List<Actor> list=Stream.concat(s1, s2)
              .map(s->new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1])))
              .collect(Collectors.toList());
      System.out.println(list);

    }
}
