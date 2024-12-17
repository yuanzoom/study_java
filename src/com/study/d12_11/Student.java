package com.study.d12_11;

public class Student extends Person{
    private int id;
    private int score;
    public Student(){

    }

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }
    public String say(){
        return super.say()+","+id+","+score;
    }

}
