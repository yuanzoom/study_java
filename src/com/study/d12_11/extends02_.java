package com.study.d12_11;

public class extends02_ {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu("1");
        computer.setNeicun("2");
        computer.setYingpan("3");
        PC pc = new PC();
        pc.setBrand("4");
        System.out.println(computer.getDetails());
        System.out.println(pc.getDetails());
    }
}

class Computer {
    private String cpu;
    private String neicun;
    private String yingpan;

    public Computer() {
    }

    public Computer(String cpu, String neicun, String yingpan) {
        this.cpu = cpu;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getYingpan() {
        return yingpan;
    }

    public void setYingpan(String yingpan) {
        this.yingpan = yingpan;
    }

    public String getDetails() {
        return cpu + neicun + yingpan;
    }
}

class PC extends Computer {
    private String brand;

    public PC() {
    }

    public PC(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDetails() {
        return super.getDetails() + brand;
    }

}

