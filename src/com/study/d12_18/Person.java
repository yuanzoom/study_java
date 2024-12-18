package study.d12_18;

import java.util.Random;

public class Person {
    private String name;
    private int blood;

    public Person() {
    }

    public Person(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void stack(Person peason) {
        Random random = new Random();
        int hurt = random.nextInt(30) + 1;
        peason.blood = peason.blood - hurt;
        peason.blood = (peason.blood < 0) ? 0 : peason.blood;
        System.out.println(this.name + "举起拳头来打了" + peason.name + ",打了" +
                hurt + "伤害，" + peason.name + "还剩" + peason.getBlood() + "血");
    }

}
