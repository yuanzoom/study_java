package study.d12_26;

public class Car {
    String carname;
    int carage;

    private class  Engine implements teach{
        String enginename;
        public void show(){
            System.out.println(enginename);
        }

        @Override
        public void teach() {
            System.out.println("教");
        }
    }
    public teach getEngin(){
        return new Engine();
    }
}
