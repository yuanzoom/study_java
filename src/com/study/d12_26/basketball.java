package study.d12_26;

public class basketball extends person implements learn,teach{
    public basketball(String name, int age) {
        super(name, age);
    }

    public void B(){
        System.out.print("打篮球");
    }

    @Override
    public void teach() {
        System.out.print("教");
    }

    @Override
    public void learn() {
        System.out.print("学");
    }
}

