package study.d12_24;

public class Staticstudy {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        student1.setId("1");
        student1.setName("aa");
        student1.setAge(22);
        student1.setAddress("aaaa");
        student1.show();
        Student.a = "t";
        student2.setId("2");
        student2.setName("bb");
        student2.setAge(233);
        student2.setAddress("adda");
        student2.show();
    }
}
