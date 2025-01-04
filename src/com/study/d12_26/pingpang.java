package study.d12_26;

public class pingpang extends person implements learn,teach,English{
    public pingpang(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.print("说英语");
    }
    public void T(){
        System.out.print("打乒乓球");
    }

    @Override
    public void learn() {
        System.out.print("学");
    }

    @Override
    public void teach() {
        System.out.println("教");
    }
}
