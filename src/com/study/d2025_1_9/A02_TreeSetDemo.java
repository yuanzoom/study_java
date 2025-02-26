package study.d2025_1_9;

import java.util.Comparator;
import java.util.TreeSet;

public class A02_TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> tr=new TreeSet<>((String o1, String o2)-> {
                int i=o1.length()-o2.length();
                i=i==0?o1.compareTo(o2):i;
                return i;
            }
        );
        tr.add("b");
        tr.add("afss");
        tr.add("cd");
        tr.add("ef");
        tr.add("dgr");
        tr.add("efss");
        System.out.println(tr);
    }
}
