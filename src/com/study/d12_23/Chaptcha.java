package study.d12_23;

import java.util.Random;

public class Chaptcha {
    public static void main(String[] args) {
        String s1 = randomNum();
        System.out.println(s1);
        System.out.println(check(s1));
    }
    public static String randomNum() {
        Random random = new Random();
        int number = random.nextInt(10);
        String[] str = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        StringBuilder s1 = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            int letter = random.nextInt(52);
            s1.append(str[letter]);
        }
//        int number2 = random.nextInt(5);
//        String s3 = s1.toString();
//        String s4 = s3.substring(number2);
//        String s5=s1.substring(0,number2);

        return s1.toString()+number;
    }
    public static String check(String arr) {
        char[] s1 = arr.toCharArray();
        Random random = new Random();
        for (int i = 0; i < arr.length(); i++) {
            int num = random.nextInt(arr.length());
            char swap;
            swap = s1[i];
            s1[i] = s1[num];
            s1[num] = swap;
        }
        String s2 = new String(s1);
        return s2;
    }
}

