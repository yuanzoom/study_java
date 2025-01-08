package study.d2025_1_6;

public class lihuacat extends Cat {

    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的" + this.getName() + "正在吃鱼");

    }
}
