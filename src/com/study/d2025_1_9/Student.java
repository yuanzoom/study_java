package study.d2025_1_9;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int ChineseScore;
    private int MathScore;
    private int EnglishScore;

    public Student() {
    }

    public Student(String name, int age, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        this.age = age;
        ChineseScore = chineseScore;
        MathScore = mathScore;
        EnglishScore = englishScore;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ChineseScore=" + ChineseScore +
                ", MathScore=" + MathScore +
                ", EnglishScore=" + EnglishScore +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        int sum1 = this.getChineseScore() + this.getMathScore() + this.getEnglishScore();
//        int sum2 = o.getChineseScore() + o.getMathScore() + o.getEnglishScore();
//        int i = 0;
//        i = sum1 - sum2;
//        i=i==0?this.getChineseScore()-o.getChineseScore():i;
//        i=i==0?this.getMathScore()-o.getMathScore():i;
//        i=i==0?this.getEnglishScore()-o.getEnglishScore():i;
//        i=i==0?this.getChineseScore()-o.getChineseScore():i;
//        i=i==0?this.getAge()-o.getAge():i;
//        i=i==0?this.getName().compareTo(o.getName()):i;
//        return i;
//    }
}
