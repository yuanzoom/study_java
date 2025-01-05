package study.d2025_1_4;

public class 正则表达式 {
    public static void main(String[] args) {
        String rex1="\\w{4,16}";
        System.out.println("1234dzhang".matches(rex1));
        String rex2="[1-9]\\d{16}[[\\d]|[X]|[x]]";
        System.out.println("12345678901234567I".matches(rex2));
    }
}
