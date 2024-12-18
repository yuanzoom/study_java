package study.d12_18;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Attribute[] arr=new Attribute[3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            Attribute car=new Attribute();
            System.out.println("请输入第"+(i+1)+"辆车的品牌");
            String brand=scanner.next();
            car.setBrand(brand);
            System.out.println("请输入第"+(i+1)+"辆车的价格");
            String price=scanner.next();
            car.setPrice(price);
            System.out.println("请输入第"+(i+1)+"辆车的颜色");
            String color=scanner.next();
            car.setColor(color);
            arr[i]=car;
        }
        for(int j=0;j<arr.length;j++){
            Attribute c=arr[j];
            System.out.println(c.getBrand()+" "+c.getPrice()+" "+c.getColor());
        }
    }


}
