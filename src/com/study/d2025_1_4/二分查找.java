package study.d2025_1_4;

import java.util.Arrays;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=5;
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        int count=0;
        while(low<high){
            count++;
            if(arr[mid]<key){
                low=mid+1;
                mid=(low+high)/2;
                continue;
            }
            if(arr[mid]>key){
                high=mid-1;
                mid=(low+high)/2;
                continue;
            }
            if(arr[mid]==key){
                System.out.println("找到了"+count);
                return;
            }
        }
        System.out.println("没找到");
    }
}
