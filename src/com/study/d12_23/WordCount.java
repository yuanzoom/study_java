package study.d12_23;

public class WordCount {
    public static void main(String[] args) {
        String str = "hello word123";
        System.out.println(Count(str));
    }

    public static int Count(String str) {
        int count1 = 0;
        for (int i = (str.length()-1); i>=0 ; i--) {
            if (str.charAt(i) != ' ') {
                count1++;
            }
            if (str.charAt(i) == ' ') {
                break;
            }
        }
        return count1;
    }
}
