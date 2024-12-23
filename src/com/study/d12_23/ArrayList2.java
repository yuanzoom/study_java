package study.d12_23;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            User user = new User();
            System.out.println("请输入id");
            int id = sc.nextInt();
            System.out.println("请输入name");
            String name = sc.next();
            System.out.println("请输入密码");
            String passwd = sc.next();
            user.setId(id);
            user.setUsername(name);
            user.setPassword(passwd);
            list.add(user);
        }
        boolean result=select(list,3);
        int index=index(list,3);
        System.out.println(result);
        User user=list.get(index);
        System.out.println(user.getId()+" "+user.getUsername()+" "+user.getPassword());
    }

    public static boolean select(ArrayList<User> list, int id) {
        return index(list,id)>=0;
    }
    public static int index(ArrayList<User> list, int id){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (id == user.getId()) {
                return i;
            }
        }
        return -1;
    }
}
