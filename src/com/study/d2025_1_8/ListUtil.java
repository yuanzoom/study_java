package study.d2025_1_8;

import java.util.ArrayList;

public class ListUtil {
    public static<E> void addAll(ArrayList<E> list,E... e){
        for (E element:e) {
            list.add(element);
        }
    }
}
