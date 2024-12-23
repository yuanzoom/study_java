package study.d12_22;

public class Phonenumber {
    public static void main(String[] args) {
        String phonenumber ="11964835478";
        String start=phonenumber.substring(0,3);
        String end =phonenumber.substring(7);
        String result=start+"****"+end;
        System.out.println(result);
    }
}
