package study.d2025_1_8;

import java.util.Arrays;

public class MyArraylist<E> {
    Object[] obj=new Object[10];
    int size;
    //E表示不确定的类型，该类型在类名后面已经定义过了
    public boolean add(E e){
            obj[size++]=e;
            return true;
    }
    public E get(int index){
        return (E)obj[index];
    }

    //重写toString方法
    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
