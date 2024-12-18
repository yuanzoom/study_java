package study.d12_18;


public class FlageGame {
    public static void main(String[] args) {
        Person person1 = new Person("乔峰", 100);
        Person person2 = new Person("鸠摩智", 100);

        while (true) {
            person1.stack(person2);
            if (person2.getBlood() == 0) {
                System.out.println(person1.getName() + "ko" + person2.getName());
                break;
            }
            person2.stack(person1);
            if (person1.getBlood() == 0) {
                System.out.println(person2.getName() + "ko" + person1.getName());
                break;
            }
        }
    }
}
