package study.d2025_2_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list2 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);
    }
}
